package com.server.auditor.ssh.client.contracts;

import android.text.Editable;
import com.server.auditor.ssh.client.database.models.SnippetPackageDBModel;
import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import com.server.auditor.ssh.client.vaults.conflicts.ConflictsArgData;
import com.server.auditor.ssh.client.vaults.conflicts.SourceEntitiesArgData;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class j2 extends MvpViewState<k2> implements k2 {

    public class a extends ViewCommand<k2> {
        a() {
            super("closeCredentialsKindBottomSheet", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.G8();
        }
    }

    public class b extends ViewCommand<k2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f22358a;

        b(long j10) {
            super("closeScreenAfterSaving", OneExecutionStateStrategy.class);
            this.f22358a = j10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.T3(this.f22358a);
        }
    }

    public class c extends ViewCommand<k2> {
        c() {
            super("closeVaultSelectorBottomSheet", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.I();
        }
    }

    public class d extends ViewCommand<k2> {
        d() {
            super("disableFieldsForTeamMembers", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.V6();
        }
    }

    public class e extends ViewCommand<k2> {
        e() {
            super("enableFieldsForMembers", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.D7();
        }
    }

    public class f extends ViewCommand<k2> {
        f() {
            super("enableFieldsForOwnerAndEditors", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.j8();
        }
    }

    public class g extends ViewCommand<k2> {
        g() {
            super("hideKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.l();
        }
    }

    public class h extends ViewCommand<k2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final VaultKeyId f22366b;

        h(boolean z10, VaultKeyId vaultKeyId) {
            super("initSelector", AddToEndSingleStrategy.class);
            this.f22365a = z10;
            this.f22366b = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.H8(this.f22365a, this.f22366b);
        }
    }

    public class i extends ViewCommand<k2> {
        i() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.a();
        }
    }

    public class j extends ViewCommand<k2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConflictsArgData[] f22371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SourceEntitiesArgData[] f22372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f22373e;

        j(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2) {
            super("navigateToOrdinaryConflictsResolverScreen", OneExecutionStateStrategy.class);
            this.f22369a = vaultKeyId;
            this.f22370b = str;
            this.f22371c = conflictsArgDataArr;
            this.f22372d = sourceEntitiesArgDataArr;
            this.f22373e = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.Z1(this.f22369a, this.f22370b, this.f22371c, this.f22372d, this.f22373e);
        }
    }

    public class k extends ViewCommand<k2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ConflictsArgData[] f22377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SourceEntitiesArgData[] f22378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f22379e;

        k(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2) {
            super("navigateToPortForwardingConflictsResolverScreen", OneExecutionStateStrategy.class);
            this.f22375a = vaultKeyId;
            this.f22376b = str;
            this.f22377c = conflictsArgDataArr;
            this.f22378d = sourceEntitiesArgDataArr;
            this.f22379e = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.v1(this.f22375a, this.f22376b, this.f22377c, this.f22378d, this.f22379e);
        }
    }

    public class l extends ViewCommand<k2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SnippetPackageDBModel f22381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22382b;

        l(SnippetPackageDBModel snippetPackageDBModel, String str) {
            super("navigateToSetupTeamVaultFlow", OneExecutionStateStrategy.class);
            this.f22381a = snippetPackageDBModel;
            this.f22382b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.o4(this.f22381a, this.f22382b);
        }
    }

    public class m extends ViewCommand<k2> {
        m() {
            super("navigateUp", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.j();
        }
    }

    public class n extends ViewCommand<k2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Editable f22385a;

        n(Editable editable) {
            super("setName", OneExecutionStateStrategy.class);
            this.f22385a = editable;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.h4(this.f22385a);
        }
    }

    public class o extends ViewCommand<k2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Editable f22387a;

        o(Editable editable) {
            super("setPackageName", OneExecutionStateStrategy.class);
            this.f22387a = editable;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.u9(this.f22387a);
        }
    }

    public class p extends ViewCommand<k2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qq.a f22389a;

        p(qq.a aVar) {
            super("showCredentialsKindDialog", OneExecutionStateStrategy.class);
            this.f22389a = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.ic(this.f22389a);
        }
    }

    public class q extends ViewCommand<k2> {
        q() {
            super("showNotEnoughPermissionAlert", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.j7();
        }
    }

    public class r extends ViewCommand<k2> {
        r() {
            super("showRequiredFieldsDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.s8();
        }
    }

    public class s extends ViewCommand<k2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qq.b f22393a;

        s(qq.b bVar) {
            super("showVaultSelectorBottomSheet", OneExecutionStateStrategy.class);
            this.f22393a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.B(this.f22393a);
        }
    }

    public class t extends ViewCommand<k2> {
        t() {
            super("showVaultSuccessScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.l3();
        }
    }

    public class u extends ViewCommand<k2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.server.auditor.ssh.client.help.a0 f22396a;

        u(com.server.auditor.ssh.client.help.a0 a0Var) {
            super("updateNameInputFieldError", OneExecutionStateStrategy.class);
            this.f22396a = a0Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.ce(this.f22396a);
        }
    }

    public class v extends ViewCommand<k2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22398a;

        v(boolean z10) {
            super("updateSaveButtonState", OneExecutionStateStrategy.class);
            this.f22398a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.X(this.f22398a);
        }
    }

    public class w extends ViewCommand<k2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22400a;

        w(boolean z10) {
            super("updateUnsavedChangesIndicator", OneExecutionStateStrategy.class);
            this.f22400a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.W7(this.f22400a);
        }
    }

    public class x extends ViewCommand<k2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22402a;

        x(VaultKeyId vaultKeyId) {
            super("updateVaultSelectorCurrentValue", OneExecutionStateStrategy.class);
            this.f22402a = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(k2 k2Var) {
            k2Var.De(this.f22402a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void B(qq.b bVar) {
        s sVar = new s(bVar);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).B(bVar);
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void D7() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).D7();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void De(VaultKeyId vaultKeyId) {
        x xVar = new x(vaultKeyId);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).De(vaultKeyId);
        }
        this.viewCommands.afterApply(xVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void G8() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).G8();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void H8(boolean z10, VaultKeyId vaultKeyId) {
        h hVar = new h(z10, vaultKeyId);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).H8(z10, vaultKeyId);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void I() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).I();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void T3(long j10) {
        b bVar = new b(j10);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).T3(j10);
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void V6() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).V6();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void W7(boolean z10) {
        w wVar = new w(z10);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).W7(z10);
        }
        this.viewCommands.afterApply(wVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void X(boolean z10) {
        v vVar = new v(z10);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).X(z10);
        }
        this.viewCommands.afterApply(vVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void Z1(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2) {
        VaultKeyId vaultKeyId2 = vaultKeyId;
        String str3 = str;
        ConflictsArgData[] conflictsArgDataArr2 = conflictsArgDataArr;
        SourceEntitiesArgData[] sourceEntitiesArgDataArr2 = sourceEntitiesArgDataArr;
        String str4 = str2;
        j jVar = new j(vaultKeyId2, str3, conflictsArgDataArr2, sourceEntitiesArgDataArr2, str4);
        this.viewCommands.beforeApply(jVar);
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
            ((k2) it.next()).Z1(vaultKeyId3, str6, conflictsArgDataArr3, sourceEntitiesArgDataArr3, str5);
            vaultKeyId2 = vaultKeyId3;
            str3 = str6;
            conflictsArgDataArr2 = conflictsArgDataArr3;
            sourceEntitiesArgDataArr2 = sourceEntitiesArgDataArr3;
            str4 = str5;
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void a() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).a();
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void ce(com.server.auditor.ssh.client.help.a0 a0Var) {
        u uVar = new u(a0Var);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).ce(a0Var);
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void h4(Editable editable) {
        n nVar = new n(editable);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).h4(editable);
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void ic(qq.a aVar) {
        p pVar = new p(aVar);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).ic(aVar);
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void j() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).j();
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void j7() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).j7();
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void j8() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).j8();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void l() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).l();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void l3() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).l3();
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void o4(SnippetPackageDBModel snippetPackageDBModel, String str) {
        l lVar = new l(snippetPackageDBModel, str);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).o4(snippetPackageDBModel, str);
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void s8() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).s8();
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void u9(Editable editable) {
        o oVar = new o(editable);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((k2) it.next()).u9(editable);
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.k2
    public void v1(VaultKeyId vaultKeyId, String str, ConflictsArgData[] conflictsArgDataArr, SourceEntitiesArgData[] sourceEntitiesArgDataArr, String str2) {
        VaultKeyId vaultKeyId2 = vaultKeyId;
        String str3 = str;
        ConflictsArgData[] conflictsArgDataArr2 = conflictsArgDataArr;
        SourceEntitiesArgData[] sourceEntitiesArgDataArr2 = sourceEntitiesArgDataArr;
        String str4 = str2;
        k kVar = new k(vaultKeyId2, str3, conflictsArgDataArr2, sourceEntitiesArgDataArr2, str4);
        this.viewCommands.beforeApply(kVar);
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
            ((k2) it.next()).v1(vaultKeyId3, str6, conflictsArgDataArr3, sourceEntitiesArgDataArr3, str5);
            vaultKeyId2 = vaultKeyId3;
            str3 = str6;
            conflictsArgDataArr2 = conflictsArgDataArr3;
            sourceEntitiesArgDataArr2 = sourceEntitiesArgDataArr3;
            str4 = str5;
        }
        this.viewCommands.afterApply(kVar);
    }
}

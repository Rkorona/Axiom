package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.models.TypedEntityIdentifier;
import com.server.auditor.ssh.client.presenters.SetupTeamVaultCredentialsModePresenter;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class z1 extends MvpViewState<a2> implements a2 {

    public class a extends ViewCommand<a2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23516a;

        a(int i10) {
            super("closeFlow", OneExecutionStateStrategy.class);
            this.f23516a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(a2 a2Var) {
            a2Var.x(this.f23516a);
        }
    }

    public class b extends ViewCommand<a2> {
        b() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(a2 a2Var) {
            a2Var.a();
        }
    }

    public class c extends ViewCommand<a2> {
        c() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(a2 a2Var) {
            a2Var.b();
        }
    }

    public class d extends ViewCommand<a2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f23521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f23522c;

        d(int i10, boolean z10, String str) {
            super("navigateToChooseEntitiesToShareScreen", OneExecutionStateStrategy.class);
            this.f23520a = i10;
            this.f23521b = z10;
            this.f23522c = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(a2 a2Var) {
            a2Var.xa(this.f23520a, this.f23521b, this.f23522c);
        }
    }

    public class e extends ViewCommand<a2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<TypedEntityIdentifier> f23524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f23525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f23526c;

        e(List<TypedEntityIdentifier> list, boolean z10, String str) {
            super("navigateToInviteColleaguesScreen", OneExecutionStateStrategy.class);
            this.f23524a = list;
            this.f23525b = z10;
            this.f23526c = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(a2 a2Var) {
            a2Var.c7(this.f23524a, this.f23525b, this.f23526c);
        }
    }

    public class f extends ViewCommand<a2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23528a;

        f(int i10) {
            super("navigateToSuccessScreen", OneExecutionStateStrategy.class);
            this.f23528a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(a2 a2Var) {
            a2Var.oc(this.f23528a);
        }
    }

    public class g extends ViewCommand<a2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SetupTeamVaultCredentialsModePresenter.a f23530a;

        g(SetupTeamVaultCredentialsModePresenter.a aVar) {
            super("selectCredentialsMode", OneExecutionStateStrategy.class);
            this.f23530a = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(a2 a2Var) {
            a2Var.ad(this.f23530a);
        }
    }

    public class h extends ViewCommand<a2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23532a;

        h(boolean z10) {
            super("updateActionBarBackButtonVisibility", AddToEndSingleStrategy.class);
            this.f23532a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(a2 a2Var) {
            a2Var.Y6(this.f23532a);
        }
    }

    public class i extends ViewCommand<a2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23534a;

        i(boolean z10) {
            super("updateDoItLaterButtonVisibility", AddToEndSingleStrategy.class);
            this.f23534a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(a2 a2Var) {
            a2Var.l0(this.f23534a);
        }
    }

    public class j extends ViewCommand<a2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23536a;

        j(boolean z10) {
            super("updateNextButtonState", AddToEndSingleStrategy.class);
            this.f23536a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(a2 a2Var) {
            a2Var.o3(this.f23536a);
        }
    }

    public class k extends ViewCommand<a2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SetupTeamVaultCredentialsModePresenter.b f23538a;

        k(SetupTeamVaultCredentialsModePresenter.b bVar) {
            super("updateSetupStepInfo", AddToEndSingleStrategy.class);
            this.f23538a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(a2 a2Var) {
            a2Var.q7(this.f23538a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.a2
    public void Y6(boolean z10) {
        h hVar = new h(z10);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((a2) it.next()).Y6(z10);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.a2
    public void a() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((a2) it.next()).a();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.a2
    public void ad(SetupTeamVaultCredentialsModePresenter.a aVar) {
        g gVar = new g(aVar);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((a2) it.next()).ad(aVar);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.a2
    public void b() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((a2) it.next()).b();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.a2
    public void c7(List<TypedEntityIdentifier> list, boolean z10, String str) {
        e eVar = new e(list, z10, str);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((a2) it.next()).c7(list, z10, str);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.a2
    public void l0(boolean z10) {
        i iVar = new i(z10);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((a2) it.next()).l0(z10);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.a2
    public void o3(boolean z10) {
        j jVar = new j(z10);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((a2) it.next()).o3(z10);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.a2
    public void oc(int i10) {
        f fVar = new f(i10);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((a2) it.next()).oc(i10);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.a2
    public void q7(SetupTeamVaultCredentialsModePresenter.b bVar) {
        k kVar = new k(bVar);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((a2) it.next()).q7(bVar);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.a2
    public void x(int i10) {
        a aVar = new a(i10);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((a2) it.next()).x(i10);
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.a2
    public void xa(int i10, boolean z10, String str) {
        d dVar = new d(i10, z10, str);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((a2) it.next()).xa(i10, z10, str);
        }
        this.viewCommands.afterApply(dVar);
    }
}

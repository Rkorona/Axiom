package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.ui.vaults.data.VaultKeyId;
import java.util.ArrayList;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class h2 extends MvpViewState<i2> implements i2 {

    public class a extends ViewCommand<i2> {
        a() {
            super("finishActivity", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i2 i2Var) {
            i2Var.tb();
        }
    }

    public class b extends ViewCommand<i2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f22316a;

        b(long j10) {
            super("finishActivityWithSelectedPackage", OneExecutionStateStrategy.class);
            this.f22316a = j10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i2 i2Var) {
            i2Var.Lb(this.f22316a);
        }
    }

    public class c extends ViewCommand<i2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<di.f> f22318a;

        c(ArrayList<di.f> arrayList) {
            super("initDataForAdapter", OneExecutionStateStrategy.class);
            this.f22318a = arrayList;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i2 i2Var) {
            i2Var.ia(this.f22318a);
        }
    }

    public class d extends ViewCommand<i2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VaultKeyId f22320a;

        d(VaultKeyId vaultKeyId) {
            super("initView", AddToEndSingleStrategy.class);
            this.f22320a = vaultKeyId;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i2 i2Var) {
            i2Var.D9(this.f22320a);
        }
    }

    public class e extends ViewCommand<i2> {
        e() {
            super("navigateUp", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i2 i2Var) {
            i2Var.j();
        }
    }

    public class f extends ViewCommand<i2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f22323a;

        f(long j10) {
            super("navigateUpWithSelectedPackage", OneExecutionStateStrategy.class);
            this.f22323a = j10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i2 i2Var) {
            i2Var.Gc(this.f22323a);
        }
    }

    public class g extends ViewCommand<i2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<di.f> f22325a;

        g(ArrayList<di.f> arrayList) {
            super("updateDataInAdapter", OneExecutionStateStrategy.class);
            this.f22325a = arrayList;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i2 i2Var) {
            i2Var.Y4(this.f22325a);
        }
    }

    public class h extends ViewCommand<i2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22327a;

        h(String str) {
            super("updateScreenTitle", OneExecutionStateStrategy.class);
            this.f22327a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(i2 i2Var) {
            i2Var.Q1(this.f22327a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i2
    public void D9(VaultKeyId vaultKeyId) {
        d dVar = new d(vaultKeyId);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i2) it.next()).D9(vaultKeyId);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i2
    public void Gc(long j10) {
        f fVar = new f(j10);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i2) it.next()).Gc(j10);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i2
    public void Lb(long j10) {
        b bVar = new b(j10);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i2) it.next()).Lb(j10);
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i2
    public void Q1(String str) {
        h hVar = new h(str);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i2) it.next()).Q1(str);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i2
    public void Y4(ArrayList<di.f> arrayList) {
        g gVar = new g(arrayList);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i2) it.next()).Y4(arrayList);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i2
    public void ia(ArrayList<di.f> arrayList) {
        c cVar = new c(arrayList);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i2) it.next()).ia(arrayList);
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i2
    public void j() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i2) it.next()).j();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.i2
    public void tb() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((i2) it.next()).tb();
        }
        this.viewCommands.afterApply(aVar);
    }
}

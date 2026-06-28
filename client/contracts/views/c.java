package com.server.auditor.ssh.client.contracts.views;

import com.server.auditor.ssh.client.models.ImportOptionType;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class c extends MvpViewState<d> implements d {

    public class a extends ViewCommand<d> {
        a() {
            super("finishFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d dVar) {
            dVar.p();
        }
    }

    public class b extends ViewCommand<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<? extends ImportOptionType> f23409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<? extends ImportOptionType> f23410b;

        b(List<? extends ImportOptionType> list, List<? extends ImportOptionType> list2) {
            super("initView", AddToEndSingleStrategy.class);
            this.f23409a = list;
            this.f23410b = list2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d dVar) {
            dVar.Sc(this.f23409a, this.f23410b);
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.views.c$c, reason: collision with other inner class name */
    public class C0376c extends ViewCommand<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImportOptionType f23412a;

        C0376c(ImportOptionType importOptionType) {
            super("navigateToImportOptionScreen", OneExecutionStateStrategy.class);
            this.f23412a = importOptionType;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(d dVar) {
            dVar.Uc(this.f23412a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.d
    public void Sc(List<? extends ImportOptionType> list, List<? extends ImportOptionType> list2) {
        b bVar = new b(list, list2);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d) it.next()).Sc(list, list2);
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.d
    public void Uc(ImportOptionType importOptionType) {
        C0376c c0376c = new C0376c(importOptionType);
        this.viewCommands.beforeApply(c0376c);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d) it.next()).Uc(importOptionType);
        }
        this.viewCommands.afterApply(c0376c);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.views.d
    public void p() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((d) it.next()).p();
        }
        this.viewCommands.afterApply(aVar);
    }
}

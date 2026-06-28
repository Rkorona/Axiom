package com.server.auditor.ssh.client.contracts.snippets;

import android.text.Editable;
import com.server.auditor.ssh.client.models.SnippetItem;
import com.server.auditor.ssh.client.models.snippet.SnippetSourceOrigin;
import com.server.auditor.ssh.client.presenters.snippets.SnippetVariableSetupPresenter;
import com.server.auditor.ssh.client.widget.textview.TextRoundedBgAnnotation;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class a extends MvpViewState<com.server.auditor.ssh.client.contracts.snippets.b> implements com.server.auditor.ssh.client.contracts.snippets.b {

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.contracts.snippets.a$a, reason: collision with other inner class name */
    public class C0353a extends ViewCommand<com.server.auditor.ssh.client.contracts.snippets.b> {
        C0353a() {
            super("finishScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.snippets.b bVar) {
            bVar.c4();
        }
    }

    public class b extends ViewCommand<com.server.auditor.ssh.client.contracts.snippets.b> {
        b() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.snippets.b bVar) {
            bVar.a();
        }
    }

    public class c extends ViewCommand<com.server.auditor.ssh.client.contracts.snippets.b> {
        c() {
            super("invalidateSnippetScriptPreview", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.snippets.b bVar) {
            bVar.z5();
        }
    }

    public class d extends ViewCommand<com.server.auditor.ssh.client.contracts.snippets.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SnippetItem f22901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SnippetSourceOrigin f22904d;

        d(SnippetItem snippetItem, int i10, boolean z10, SnippetSourceOrigin snippetSourceOrigin) {
            super("runSnippet", OneExecutionStateStrategy.class);
            this.f22901a = snippetItem;
            this.f22902b = i10;
            this.f22903c = z10;
            this.f22904d = snippetSourceOrigin;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.snippets.b bVar) {
            bVar.Ob(this.f22901a, this.f22902b, this.f22903c, this.f22904d);
        }
    }

    public class e extends ViewCommand<com.server.auditor.ssh.client.contracts.snippets.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SnippetVariableSetupPresenter.b f22906a;

        e(SnippetVariableSetupPresenter.b bVar) {
            super("setupEditTextControlWith", OneExecutionStateStrategy.class);
            this.f22906a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.snippets.b bVar) {
            bVar.we(this.f22906a);
        }
    }

    public class f extends ViewCommand<com.server.auditor.ssh.client.contracts.snippets.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22908a;

        f(boolean z10) {
            super("updateActionButtonVisibility", AddToEndSingleStrategy.class);
            this.f22908a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.snippets.b bVar) {
            bVar.ma(this.f22908a);
        }
    }

    public class g extends ViewCommand<com.server.auditor.ssh.client.contracts.snippets.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22910a;

        g(boolean z10) {
            super("updateDoneButtonVisibility", OneExecutionStateStrategy.class);
            this.f22910a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.snippets.b bVar) {
            bVar.h7(this.f22910a);
        }
    }

    public class h extends ViewCommand<com.server.auditor.ssh.client.contracts.snippets.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22912a;

        h(boolean z10) {
            super("updateEditTextVisibility", OneExecutionStateStrategy.class);
            this.f22912a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.snippets.b bVar) {
            bVar.r3(this.f22912a);
        }
    }

    public class i extends ViewCommand<com.server.auditor.ssh.client.contracts.snippets.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22914a;

        i(boolean z10) {
            super("updateRunButtonState", AddToEndSingleStrategy.class);
            this.f22914a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.snippets.b bVar) {
            bVar.O6(this.f22914a);
        }
    }

    public class j extends ViewCommand<com.server.auditor.ssh.client.contracts.snippets.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Editable f22916a;

        j(Editable editable) {
            super("updateSnippetScriptPreview", AddToEndSingleStrategy.class);
            this.f22916a = editable;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.snippets.b bVar) {
            bVar.E6(this.f22916a);
        }
    }

    public class k extends ViewCommand<com.server.auditor.ssh.client.contracts.snippets.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextRoundedBgAnnotation f22918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22920c;

        k(TextRoundedBgAnnotation textRoundedBgAnnotation, boolean z10, boolean z11) {
            super("updateSpanBackgroundColor", OneExecutionStateStrategy.class);
            this.f22918a = textRoundedBgAnnotation;
            this.f22919b = z10;
            this.f22920c = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(com.server.auditor.ssh.client.contracts.snippets.b bVar) {
            bVar.zb(this.f22918a, this.f22919b, this.f22920c);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.snippets.b
    public void E6(Editable editable) {
        j jVar = new j(editable);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.snippets.b) it.next()).E6(editable);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.snippets.b
    public void O6(boolean z10) {
        i iVar = new i(z10);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.snippets.b) it.next()).O6(z10);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.snippets.b
    public void Ob(SnippetItem snippetItem, int i10, boolean z10, SnippetSourceOrigin snippetSourceOrigin) {
        d dVar = new d(snippetItem, i10, z10, snippetSourceOrigin);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.snippets.b) it.next()).Ob(snippetItem, i10, z10, snippetSourceOrigin);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.snippets.b
    public void a() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.snippets.b) it.next()).a();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.snippets.b
    public void c4() {
        C0353a c0353a = new C0353a();
        this.viewCommands.beforeApply(c0353a);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.snippets.b) it.next()).c4();
        }
        this.viewCommands.afterApply(c0353a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.snippets.b
    public void h7(boolean z10) {
        g gVar = new g(z10);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.snippets.b) it.next()).h7(z10);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.snippets.b
    public void ma(boolean z10) {
        f fVar = new f(z10);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.snippets.b) it.next()).ma(z10);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.snippets.b
    public void r3(boolean z10) {
        h hVar = new h(z10);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.snippets.b) it.next()).r3(z10);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.snippets.b
    public void we(SnippetVariableSetupPresenter.b bVar) {
        e eVar = new e(bVar);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.snippets.b) it.next()).we(bVar);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.snippets.b
    public void z5() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.snippets.b) it.next()).z5();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.snippets.b
    public void zb(TextRoundedBgAnnotation textRoundedBgAnnotation, boolean z10, boolean z11) {
        k kVar = new k(textRoundedBgAnnotation, z10, z11);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((com.server.auditor.ssh.client.contracts.snippets.b) it.next()).zb(textRoundedBgAnnotation, z10, z11);
        }
        this.viewCommands.afterApply(kVar);
    }
}

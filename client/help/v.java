package com.server.auditor.ssh.client.help;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;

/* JADX INFO: loaded from: classes3.dex */
public class v extends MvpViewState<w> implements w {

    public class a extends ViewCommand<w> {
        a() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(w wVar) {
            wVar.a();
        }
    }

    public class b extends ViewCommand<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27115a;

        b(String str) {
            super("openSitePage", AddToEndSingleStrategy.class);
            this.f27115a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(w wVar) {
            wVar.e9(this.f27115a);
        }
    }

    public class c extends ViewCommand<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f27117a;

        c(boolean z10) {
            super("updateErrorLayoutVisibility", AddToEndSingleStrategy.class);
            this.f27117a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(w wVar) {
            wVar.ra(this.f27117a);
        }
    }

    public class d extends ViewCommand<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f27119a;

        d(boolean z10) {
            super("updateLoadingViewVisibility", AddToEndSingleStrategy.class);
            this.f27119a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(w wVar) {
            wVar.Re(this.f27119a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.help.w
    public void Re(boolean z10) {
        d dVar = new d(z10);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((w) it.next()).Re(z10);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.help.w
    public void a() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((w) it.next()).a();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.help.w
    public void e9(String str) {
        b bVar = new b(str);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((w) it.next()).e9(str);
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.help.w
    public void ra(boolean z10) {
        c cVar = new c(z10);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((w) it.next()).ra(z10);
        }
        this.viewCommands.afterApply(cVar);
    }
}

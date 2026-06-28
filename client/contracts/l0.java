package com.server.auditor.ssh.client.contracts;

import com.server.auditor.ssh.client.fragments.editors.choisemanagers.TypefaceModel;
import java.util.Iterator;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class l0 extends MvpViewState<m0> implements m0 {

    public class a extends ViewCommand<m0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22408b;

        a(int i10, int i11) {
            super("applyColorSchemeForTerminalView", OneExecutionStateStrategy.class);
            this.f22407a = i10;
            this.f22408b = i11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(m0 m0Var) {
            m0Var.Kd(this.f22407a, this.f22408b);
        }
    }

    public class b extends ViewCommand<m0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22410a;

        b(int i10) {
            super("applyFontSize", OneExecutionStateStrategy.class);
            this.f22410a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(m0 m0Var) {
            m0Var.Hc(this.f22410a);
        }
    }

    public class c extends ViewCommand<m0> {
        c() {
            super("applyTitleForSettingsMode", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(m0 m0Var) {
            m0Var.S5();
        }
    }

    public class d extends ViewCommand<m0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypefaceModel f22413a;

        d(TypefaceModel typefaceModel) {
            super("applyTypefaceForTerminalView", OneExecutionStateStrategy.class);
            this.f22413a = typefaceModel;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(m0 m0Var) {
            m0Var.Oa(this.f22413a);
        }
    }

    public class e extends ViewCommand<m0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f22415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f22417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f22418d;

        e(List<String> list, String str, int i10, boolean z10) {
            super("initView", AddToEndSingleStrategy.class);
            this.f22415a = list;
            this.f22416b = str;
            this.f22417c = i10;
            this.f22418d = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(m0 m0Var) {
            m0Var.L8(this.f22415a, this.f22416b, this.f22417c, this.f22418d);
        }
    }

    public class f extends ViewCommand<m0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f22420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TypefaceModel f22422c;

        f(Integer num, String str, TypefaceModel typefaceModel) {
            super("saveValues", OneExecutionStateStrategy.class);
            this.f22420a = num;
            this.f22421b = str;
            this.f22422c = typefaceModel;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(m0 m0Var) {
            m0Var.w5(this.f22420a, this.f22421b, this.f22422c);
        }
    }

    public class g extends ViewCommand<m0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22424a;

        g(int i10) {
            super("setColorSchemeAsSelected", OneExecutionStateStrategy.class);
            this.f22424a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(m0 m0Var) {
            m0Var.X6(this.f22424a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m0
    public void Hc(int i10) {
        b bVar = new b(i10);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((m0) it.next()).Hc(i10);
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m0
    public void Kd(int i10, int i11) {
        a aVar = new a(i10, i11);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((m0) it.next()).Kd(i10, i11);
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m0
    public void L8(List<String> list, String str, int i10, boolean z10) {
        e eVar = new e(list, str, i10, z10);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((m0) it.next()).L8(list, str, i10, z10);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m0
    public void Oa(TypefaceModel typefaceModel) {
        d dVar = new d(typefaceModel);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((m0) it.next()).Oa(typefaceModel);
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m0
    public void S5() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((m0) it.next()).S5();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m0
    public void X6(int i10) {
        g gVar = new g(i10);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((m0) it.next()).X6(i10);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.m0
    public void w5(Integer num, String str, TypefaceModel typefaceModel) {
        f fVar = new f(num, str, typefaceModel);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((m0) it.next()).w5(num, str, typefaceModel);
        }
        this.viewCommands.afterApply(fVar);
    }
}

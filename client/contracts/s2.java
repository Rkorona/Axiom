package com.server.auditor.ssh.client.contracts;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class s2 extends MvpViewState<t2> implements t2 {

    public class a extends ViewCommand<t2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22884a;

        a(String str) {
            super("copyTwoFactorCode", OneExecutionStateStrategy.class);
            this.f22884a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t2 t2Var) {
            t2Var.P5(this.f22884a);
        }
    }

    public class b extends ViewCommand<t2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22887b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f22888c;

        b(String str, String str2, String str3) {
            super("generateProvisioningURI", AddToEndSingleStrategy.class);
            this.f22886a = str;
            this.f22887b = str2;
            this.f22888c = str3;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t2 t2Var) {
            t2Var.ab(this.f22886a, this.f22887b, this.f22888c);
        }
    }

    public class c extends ViewCommand<t2> {
        c() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t2 t2Var) {
            t2Var.a();
        }
    }

    public class d extends ViewCommand<t2> {
        d() {
            super("navigateUp", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t2 t2Var) {
            t2Var.j();
        }
    }

    public class e extends ViewCommand<t2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22892a;

        e(String str) {
            super("setupCode", AddToEndSingleStrategy.class);
            this.f22892a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t2 t2Var) {
            t2Var.i8(this.f22892a);
        }
    }

    public class f extends ViewCommand<t2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22894a;

        f(String str) {
            super("showTwoFactorVerificationCodeScreen", OneExecutionStateStrategy.class);
            this.f22894a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t2 t2Var) {
            t2Var.U6(this.f22894a);
        }
    }

    public class g extends ViewCommand<t2> {
        g() {
            super("tryToOpenTOTPAppList", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t2 t2Var) {
            t2Var.Z4();
        }
    }

    public class h extends ViewCommand<t2> {
        h() {
            super("tryToShowOpen2FAProviderAppButton", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(t2 t2Var) {
            t2Var.Bd();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.t2
    public void Bd() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t2) it.next()).Bd();
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.t2
    public void P5(String str) {
        a aVar = new a(str);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t2) it.next()).P5(str);
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.t2
    public void U6(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t2) it.next()).U6(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.t2
    public void Z4() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t2) it.next()).Z4();
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.n2
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t2) it.next()).a();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.t2
    public void ab(String str, String str2, String str3) {
        b bVar = new b(str, str2, str3);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t2) it.next()).ab(str, str2, str3);
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.t2
    public void i8(String str) {
        e eVar = new e(str);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t2) it.next()).i8(str);
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.n2
    public void j() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((t2) it.next()).j();
        }
        this.viewCommands.afterApply(dVar);
    }
}

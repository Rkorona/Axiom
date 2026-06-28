package com.server.auditor.ssh.client.contracts;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class f0 extends MvpViewState<g0> implements g0 {

    public class a extends ViewCommand<g0> {
        a() {
            super("clearSensitiveData", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.M();
        }
    }

    public class a0 extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22202a;

        a0(boolean z10) {
            super("updateHowDoWeKnowVisibility", AddToEndSingleStrategy.class);
            this.f22202a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.c2(this.f22202a);
        }
    }

    public class b extends ViewCommand<g0> {
        b() {
            super("finishWithSuccess", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.n();
        }
    }

    public class b0 extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22205a;

        b0(boolean z10) {
            super("updatePasswordStrengthFirstSuggestionVisibility", AddToEndSingleStrategy.class);
            this.f22205a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.e1(this.f22205a);
        }
    }

    public class c extends ViewCommand<g0> {
        c() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.e();
        }
    }

    public class c0 extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22208a;

        c0(int i10) {
            super("updatePasswordStrengthScore", AddToEndSingleStrategy.class);
            this.f22208a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.V(this.f22208a);
        }
    }

    public class d extends ViewCommand<g0> {
        d() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.a();
        }
    }

    public class d0 extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22211a;

        d0(boolean z10) {
            super("updatePasswordStrengthSecondSuggestionVisibility", AddToEndSingleStrategy.class);
            this.f22211a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.J2(this.f22211a);
        }
    }

    public class e extends ViewCommand<g0> {
        e() {
            super("navigateUp", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.j();
        }
    }

    public class e0 extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22214a;

        e0(boolean z10) {
            super("updatePasswordStrengthWarningVisibility", AddToEndSingleStrategy.class);
            this.f22214a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.f0(this.f22214a);
        }
    }

    public class f extends ViewCommand<g0> {
        f() {
            super("openHowDoWeKnowLink", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.f1();
        }
    }

    public class g extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22217a;

        g(String str) {
            super("setPasswordStrengthFirstSuggestion", AddToEndSingleStrategy.class);
            this.f22217a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.u0(this.f22217a);
        }
    }

    public class h extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22219a;

        h(String str) {
            super("setPasswordStrengthSecondSuggestion", AddToEndSingleStrategy.class);
            this.f22219a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.z2(this.f22219a);
        }
    }

    public class i extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22221a;

        i(String str) {
            super("setPasswordStrengthWarning", AddToEndSingleStrategy.class);
            this.f22221a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.Q(this.f22221a);
        }
    }

    public class j extends ViewCommand<g0> {
        j() {
            super("showChangePasswordBlocked", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.E1();
        }
    }

    public class k extends ViewCommand<g0> {
        k() {
            super("showChangePasswordError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.S1();
        }
    }

    public class l extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22225a;

        l(String str) {
            super("showErrorSnackBar", OneExecutionStateStrategy.class);
            this.f22225a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.k(this.f22225a);
        }
    }

    public class m extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22227a;

        m(String str) {
            super("showIncorrectOldPasswordError", OneExecutionStateStrategy.class);
            this.f22227a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.Cd(this.f22227a);
        }
    }

    public class n extends ViewCommand<g0> {
        n() {
            super("showNetworkError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.g();
        }
    }

    public class o extends ViewCommand<g0> {
        o() {
            super("showPasswordNotBreachedMessage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.U();
        }
    }

    public class p extends ViewCommand<g0> {
        p() {
            super("showPasswordWasBreachedMessage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.d0();
        }
    }

    public class q extends ViewCommand<g0> {
        q() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.d();
        }
    }

    public class r extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22233a;

        r(int i10) {
            super("showThrottlingError", OneExecutionStateStrategy.class);
            this.f22233a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.m(this.f22233a);
        }
    }

    public class s extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22236b;

        s(String str, String str2) {
            super("showTwoFactorVerifyCodeScreen", OneExecutionStateStrategy.class);
            this.f22235a = str;
            this.f22236b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.M1(this.f22235a, this.f22236b);
        }
    }

    public class t extends ViewCommand<g0> {
        t() {
            super("showUnableToCheckPasswordBreachMessage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.L();
        }
    }

    public class u extends ViewCommand<g0> {
        u() {
            super("showUnexpectedError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.h();
        }
    }

    public class v extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22240a;

        v(boolean z10) {
            super("updateCheckPasswordBreachButtonEnabled", AddToEndSingleStrategy.class);
            this.f22240a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.M9(this.f22240a);
        }
    }

    public class w extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22242a;

        w(boolean z10) {
            super("updateCheckPasswordBreachButtonVisibility", AddToEndSingleStrategy.class);
            this.f22242a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.K(this.f22242a);
        }
    }

    public class x extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22244a;

        x(boolean z10) {
            super("updateCheckPasswordBreachProgressVisibility", AddToEndSingleStrategy.class);
            this.f22244a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.S(this.f22244a);
        }
    }

    public class y extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f22246a;

        y(boolean z10) {
            super("updateContinueButtonState", AddToEndSingleStrategy.class);
            this.f22246a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.E(this.f22246a);
        }
    }

    public class z extends ViewCommand<g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22248a;

        z(String str) {
            super("updateEmailInputFieldError", OneExecutionStateStrategy.class);
            this.f22248a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(g0 g0Var) {
            g0Var.Hd(this.f22248a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void Cd(String str) {
        m mVar = new m(str);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).Cd(str);
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void E(boolean z10) {
        y yVar = new y(z10);
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).E(z10);
        }
        this.viewCommands.afterApply(yVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void E1() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).E1();
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void Hd(String str) {
        z zVar = new z(str);
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).Hd(str);
        }
        this.viewCommands.afterApply(zVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void J2(boolean z10) {
        d0 d0Var = new d0(z10);
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).J2(z10);
        }
        this.viewCommands.afterApply(d0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void K(boolean z10) {
        w wVar = new w(z10);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).K(z10);
        }
        this.viewCommands.afterApply(wVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void L() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).L();
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void M() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).M();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void M1(String str, String str2) {
        s sVar = new s(str, str2);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).M1(str, str2);
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void M9(boolean z10) {
        v vVar = new v(z10);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).M9(z10);
        }
        this.viewCommands.afterApply(vVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void Q(String str) {
        i iVar = new i(str);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).Q(str);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void S(boolean z10) {
        x xVar = new x(z10);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).S(z10);
        }
        this.viewCommands.afterApply(xVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void S1() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).S1();
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void U() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).U();
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void V(int i10) {
        c0 c0Var = new c0(i10);
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).V(i10);
        }
        this.viewCommands.afterApply(c0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e0
    public void a() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).a();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void c2(boolean z10) {
        a0 a0Var = new a0(z10);
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).c2(z10);
        }
        this.viewCommands.afterApply(a0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void d() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).d();
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void d0() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).d0();
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void e() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).e();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void e1(boolean z10) {
        b0 b0Var = new b0(z10);
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).e1(z10);
        }
        this.viewCommands.afterApply(b0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void f0(boolean z10) {
        e0 e0Var = new e0(z10);
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).f0(z10);
        }
        this.viewCommands.afterApply(e0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void f1() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).f1();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void g() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).g();
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void h() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).h();
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e0
    public void j() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).j();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void k(String str) {
        l lVar = new l(str);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).k(str);
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void m(int i10) {
        r rVar = new r(i10);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).m(i10);
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.e0
    public void n() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).n();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void u0(String str) {
        g gVar = new g(str);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).u0(str);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.g0
    public void z2(String str) {
        h hVar = new h(str);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((g0) it.next()).z2(str);
        }
        this.viewCommands.afterApply(hVar);
    }
}

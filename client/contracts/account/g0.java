package com.server.auditor.ssh.client.contracts.account;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class g0 extends MvpViewState<h0> implements h0 {

    public class a extends ViewCommand<h0> {
        a() {
            super("clearPasswordInputField", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.j0();
        }
    }

    public class a0 extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21858a;

        a0(int i10) {
            super("updatePasswordStrengthScore", AddToEndSingleStrategy.class);
            this.f21858a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.V(this.f21858a);
        }
    }

    public class b extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21860a;

        b(int i10) {
            super("finishWithResult", OneExecutionStateStrategy.class);
            this.f21860a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.M7(this.f21860a);
        }
    }

    public class b0 extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21862a;

        b0(boolean z10) {
            super("updatePasswordStrengthSuggestionVisibility", AddToEndSingleStrategy.class);
            this.f21862a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.d8(this.f21862a);
        }
    }

    public class c extends ViewCommand<h0> {
        c() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.e();
        }
    }

    public class c0 extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21865a;

        c0(boolean z10) {
            super("updatePasswordStrengthWarningVisibility", AddToEndSingleStrategy.class);
            this.f21865a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.f0(this.f21865a);
        }
    }

    public class d extends ViewCommand<h0> {
        d() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.a();
        }
    }

    public class e extends ViewCommand<h0> {
        e() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.b();
        }
    }

    public class f extends ViewCommand<h0> {
        f() {
            super("navigateToCongratulationScreen", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.Jc();
        }
    }

    public class g extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21872c;

        g(int i10, boolean z10, boolean z11) {
            super("navigateToSignInChooserScreen", OneExecutionStateStrategy.class);
            this.f21870a = i10;
            this.f21871b = z10;
            this.f21872c = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.N(this.f21870a, this.f21871b, this.f21872c);
        }
    }

    public class h extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21874a;

        h(String str) {
            super("requestGooglePlayIntegrityToken", OneExecutionStateStrategy.class);
            this.f21874a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.fe(this.f21874a);
        }
    }

    public class i extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21876a;

        i(String str) {
            super("setPasswordStrengthSuggestion", AddToEndSingleStrategy.class);
            this.f21876a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.Te(this.f21876a);
        }
    }

    public class j extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21878a;

        j(String str) {
            super("setPasswordStrengthWarning", AddToEndSingleStrategy.class);
            this.f21878a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.Q(this.f21878a);
        }
    }

    public class k extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f21880a;

        k(Integer num) {
            super("showAuthBlockedDialog", OneExecutionStateStrategy.class);
            this.f21880a = num;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.xc(this.f21880a);
        }
    }

    public class l extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21882a;

        l(String str) {
            super("showErrorSnackBar", OneExecutionStateStrategy.class);
            this.f21882a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.k(this.f21882a);
        }
    }

    public class m extends ViewCommand<h0> {
        m() {
            super("showExistingAccountDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.Ia();
        }
    }

    public class n extends ViewCommand<h0> {
        n() {
            super("showKeyboard", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.i();
        }
    }

    public class o extends ViewCommand<h0> {
        o() {
            super("showNetworkError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.g();
        }
    }

    public class p extends ViewCommand<h0> {
        p() {
            super("showPasswordNotBreachedMessage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.U();
        }
    }

    public class q extends ViewCommand<h0> {
        q() {
            super("showPasswordWasBreachedMessage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.d0();
        }
    }

    public class r extends ViewCommand<h0> {
        r() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.d();
        }
    }

    public class s extends ViewCommand<h0> {
        s() {
            super("showReCaptcha", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.D();
        }
    }

    public class t extends ViewCommand<h0> {
        t() {
            super("showReCaptchaError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.F();
        }
    }

    public class u extends ViewCommand<h0> {
        u() {
            super("showUnableToCheckPasswordBreachMessage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.L();
        }
    }

    public class v extends ViewCommand<h0> {
        v() {
            super("showUnexpectedError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.h();
        }
    }

    public class w extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21894a;

        w(boolean z10) {
            super("updateCheckPasswordBreachButtonVisibility", AddToEndSingleStrategy.class);
            this.f21894a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.K(this.f21894a);
        }
    }

    public class x extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21896a;

        x(boolean z10) {
            super("updateCheckPasswordBreachProgressVisibility", AddToEndSingleStrategy.class);
            this.f21896a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.S(this.f21896a);
        }
    }

    public class y extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f21898a;

        y(boolean z10) {
            super("updateContinueButtonEnableState", AddToEndSingleStrategy.class);
            this.f21898a = z10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.y8(this.f21898a);
        }
    }

    public class z extends ViewCommand<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21900a;

        z(String str) {
            super("updatePasswordFieldError", OneExecutionStateStrategy.class);
            this.f21900a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(h0 h0Var) {
            h0Var.G(this.f21900a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void D() {
        s sVar = new s();
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).D();
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void F() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).F();
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void G(String str) {
        z zVar = new z(str);
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).G(str);
        }
        this.viewCommands.afterApply(zVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void Ia() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).Ia();
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void Jc() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).Jc();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void K(boolean z10) {
        w wVar = new w(z10);
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).K(z10);
        }
        this.viewCommands.afterApply(wVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void L() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).L();
        }
        this.viewCommands.afterApply(uVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void M7(int i10) {
        b bVar = new b(i10);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).M7(i10);
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void N(int i10, boolean z10, boolean z11) {
        g gVar = new g(i10, z10, z11);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).N(i10, z10, z11);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void Q(String str) {
        j jVar = new j(str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).Q(str);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void S(boolean z10) {
        x xVar = new x(z10);
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).S(z10);
        }
        this.viewCommands.afterApply(xVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void Te(String str) {
        i iVar = new i(str);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).Te(str);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void U() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).U();
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void V(int i10) {
        a0 a0Var = new a0(i10);
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).V(i10);
        }
        this.viewCommands.afterApply(a0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void a() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).a();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void b() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).b();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void d() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).d();
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void d0() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).d0();
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void d8(boolean z10) {
        b0 b0Var = new b0(z10);
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).d8(z10);
        }
        this.viewCommands.afterApply(b0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void e() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).e();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void f0(boolean z10) {
        c0 c0Var = new c0(z10);
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).f0(z10);
        }
        this.viewCommands.afterApply(c0Var);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void fe(String str) {
        h hVar = new h(str);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).fe(str);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void g() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).g();
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void h() {
        v vVar = new v();
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).h();
        }
        this.viewCommands.afterApply(vVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void i() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).i();
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void j0() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).j0();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void k(String str) {
        l lVar = new l(str);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).k(str);
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void xc(Integer num) {
        k kVar = new k(num);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).xc(num);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.h0
    public void y8(boolean z10) {
        y yVar = new y(z10);
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((h0) it.next()).y8(z10);
        }
        this.viewCommands.afterApply(yVar);
    }
}

package com.server.auditor.ssh.client.contracts.account;

import android.content.Intent;
import com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class w extends MvpViewState<x> implements x {

    public class a extends ViewCommand<x> {
        a() {
            super("closeFlow", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.f();
        }
    }

    public class b extends ViewCommand<x> {
        b() {
            super("hideProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.e();
        }
    }

    public class c extends ViewCommand<x> {
        c() {
            super("initView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.a();
        }
    }

    public class d extends ViewCommand<x> {
        d() {
            super("makeFirebaseAuthManagerSignedOut", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.e2();
        }
    }

    public class e extends ViewCommand<x> {
        e() {
            super("makeGoogleClientSignedOut", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.A2();
        }
    }

    public class f extends ViewCommand<x> {
        f() {
            super("navigateBack", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.b();
        }
    }

    public class g extends ViewCommand<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f21998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f21999c;

        g(int i10, boolean z10, boolean z11) {
            super("navigateToEnterpriseSingleSignOnEnterEmailScreen", OneExecutionStateStrategy.class);
            this.f21997a = i10;
            this.f21998b = z10;
            this.f21999c = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.Jd(this.f21997a, this.f21998b, this.f21999c);
        }
    }

    public class h extends ViewCommand<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22003c;

        h(int i10, boolean z10, boolean z11) {
            super("navigateToSignInEnterEmailScreen", OneExecutionStateStrategy.class);
            this.f22001a = i10;
            this.f22002b = z10;
            this.f22003c = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.e3(this.f22001a, this.f22002b, this.f22003c);
        }
    }

    public class i extends ViewCommand<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f22006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22007c;

        i(int i10, boolean z10, boolean z11) {
            super("navigateToSignUpChooserScreen", OneExecutionStateStrategy.class);
            this.f22005a = i10;
            this.f22006b = z10;
            this.f22007c = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.E7(this.f22005a, this.f22006b, this.f22007c);
        }
    }

    public class j extends ViewCommand<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FirebaseSingleSignOnAuthentication f22010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f22012d;

        j(int i10, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication, boolean z10, boolean z11) {
            super("navigateToSingleSignOnSignInScreen", OneExecutionStateStrategy.class);
            this.f22009a = i10;
            this.f22010b = firebaseSingleSignOnAuthentication;
            this.f22011c = z10;
            this.f22012d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.T1(this.f22009a, this.f22010b, this.f22011c, this.f22012d);
        }
    }

    public class k extends ViewCommand<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FirebaseSingleSignOnAuthentication f22015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f22016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f22017d;

        k(int i10, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication, boolean z10, boolean z11) {
            super("navigateToSingleSignOnSignUpScreen", OneExecutionStateStrategy.class);
            this.f22014a = i10;
            this.f22015b = firebaseSingleSignOnAuthentication;
            this.f22016c = z10;
            this.f22017d = z11;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.Y0(this.f22014a, this.f22015b, this.f22016c, this.f22017d);
        }
    }

    public class l extends ViewCommand<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22019a;

        l(String str) {
            super("showErrorSnackBar", OneExecutionStateStrategy.class);
            this.f22019a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.k(this.f22019a);
        }
    }

    public class m extends ViewCommand<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22021a;

        m(String str) {
            super("showInfoSnackBar", OneExecutionStateStrategy.class);
            this.f22021a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.Y(this.f22021a);
        }
    }

    public class n extends ViewCommand<x> {
        n() {
            super("showNetworkError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.g();
        }
    }

    public class o extends ViewCommand<x> {
        o() {
            super("showProgressDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.d();
        }
    }

    public class p extends ViewCommand<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22025a;

        p(int i10) {
            super("showThrottlingError", OneExecutionStateStrategy.class);
            this.f22025a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.m(this.f22025a);
        }
    }

    public class q extends ViewCommand<x> {
        q() {
            super("showUnexpectedError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.h();
        }
    }

    public class r extends ViewCommand<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f22028a;

        r(Intent intent) {
            super("startGoogleSignOnProcess", OneExecutionStateStrategy.class);
            this.f22028a = intent;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.K1(this.f22028a);
        }
    }

    public class s extends ViewCommand<x> {
        s() {
            super("tryToAuthenticateWithApple", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.c1();
        }
    }

    public class t extends ViewCommand<x> {
        t() {
            super("tryToAuthenticateWithGoogle", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.H1();
        }
    }

    public class u extends ViewCommand<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22032a;

        u(int i10) {
            super("updateViewsForFeature", AddToEndSingleStrategy.class);
            this.f22032a = i10;
        }

        @Override // moxy.viewstate.ViewCommand
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(x xVar) {
            xVar.z(this.f22032a);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void A2() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).A2();
        }
        this.viewCommands.afterApply(eVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void E7(int i10, boolean z10, boolean z11) {
        i iVar = new i(i10, z10, z11);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).E7(i10, z10, z11);
        }
        this.viewCommands.afterApply(iVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void H1() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).H1();
        }
        this.viewCommands.afterApply(tVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void Jd(int i10, boolean z10, boolean z11) {
        g gVar = new g(i10, z10, z11);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).Jd(i10, z10, z11);
        }
        this.viewCommands.afterApply(gVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void K1(Intent intent) {
        r rVar = new r(intent);
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).K1(intent);
        }
        this.viewCommands.afterApply(rVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void T1(int i10, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication, boolean z10, boolean z11) {
        j jVar = new j(i10, firebaseSingleSignOnAuthentication, z10, z11);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).T1(i10, firebaseSingleSignOnAuthentication, z10, z11);
        }
        this.viewCommands.afterApply(jVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void Y(String str) {
        m mVar = new m(str);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).Y(str);
        }
        this.viewCommands.afterApply(mVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void Y0(int i10, FirebaseSingleSignOnAuthentication firebaseSingleSignOnAuthentication, boolean z10, boolean z11) {
        k kVar = new k(i10, firebaseSingleSignOnAuthentication, z10, z11);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).Y0(i10, firebaseSingleSignOnAuthentication, z10, z11);
        }
        this.viewCommands.afterApply(kVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).a();
        }
        this.viewCommands.afterApply(cVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void b() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).b();
        }
        this.viewCommands.afterApply(fVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void c1() {
        s sVar = new s();
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).c1();
        }
        this.viewCommands.afterApply(sVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void d() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).d();
        }
        this.viewCommands.afterApply(oVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void e() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).e();
        }
        this.viewCommands.afterApply(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void e2() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).e2();
        }
        this.viewCommands.afterApply(dVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void e3(int i10, boolean z10, boolean z11) {
        h hVar = new h(i10, z10, z11);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).e3(i10, z10, z11);
        }
        this.viewCommands.afterApply(hVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void f() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).f();
        }
        this.viewCommands.afterApply(aVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void g() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).g();
        }
        this.viewCommands.afterApply(nVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void h() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).h();
        }
        this.viewCommands.afterApply(qVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void k(String str) {
        l lVar = new l(str);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).k(str);
        }
        this.viewCommands.afterApply(lVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void m(int i10) {
        p pVar = new p(i10);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).m(i10);
        }
        this.viewCommands.afterApply(pVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.server.auditor.ssh.client.contracts.account.x
    public void z(int i10) {
        u uVar = new u(i10);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((x) it.next()).z(i10);
        }
        this.viewCommands.afterApply(uVar);
    }
}

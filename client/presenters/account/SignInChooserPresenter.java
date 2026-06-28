package com.server.auditor.ssh.client.presenters.account;

import android.content.Intent;
import androidx.appcompat.widget.RtlSpacingHelper;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.contracts.account.x;
import com.server.auditor.ssh.client.models.account.AppleSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.GoogleSingleSignOnAuthentication;
import hg.b2;
import iu.p;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import nj.e;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class SignInChooserPresenter extends MvpPresenter<x> implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f36569d = com.server.auditor.ssh.client.utils.analytics.a.y();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qi.c f36570e;

    static final class a extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36571a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36573c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, zt.e eVar) {
            super(2, eVar);
            this.f36573c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new a(this.f36573c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36571a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserPresenter.this.getViewState().k(this.f36573c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36574a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36577d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f36576c = str;
            this.f36577d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new b(this.f36576c, this.f36577d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36574a;
            if (i10 == 0) {
                ut.x.b(obj);
                SignInChooserPresenter.this.getViewState().e2();
                AppleSingleSignOnAuthentication appleSingleSignOnAuthentication = new AppleSingleSignOnAuthentication(this.f36576c, this.f36577d);
                SignInChooserPresenter signInChooserPresenter = SignInChooserPresenter.this;
                this.f36574a = 1;
                if (signInChooserPresenter.E2(appleSingleSignOnAuthentication, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36578a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36578a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36580a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36580a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserPresenter.this.getViewState().c1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36582a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36582a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserPresenter.this.getViewState().e3(SignInChooserPresenter.this.f36566a, SignInChooserPresenter.this.f36567b, SignInChooserPresenter.this.f36568c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36584a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36584a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserPresenter.this.f36569d.h2();
            SignInChooserPresenter.this.getViewState().Jd(SignInChooserPresenter.this.f36566a, SignInChooserPresenter.this.f36567b, SignInChooserPresenter.this.f36568c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36586a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36586a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserPresenter.this.getViewState().H1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36588a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36588a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserPresenter.this.getViewState().e();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36590a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36592c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, zt.e eVar) {
            super(2, eVar);
            this.f36592c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new i(this.f36592c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36590a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserPresenter.this.getViewState().e();
            SignInChooserPresenter.this.getViewState().Y(this.f36592c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36593a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36593a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserPresenter.this.getViewState().e();
            SignInChooserPresenter.this.getViewState().g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36595a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36597c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, zt.e eVar) {
            super(2, eVar);
            this.f36597c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new k(this.f36597c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36595a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserPresenter.this.getViewState().e();
            SignInChooserPresenter.this.getViewState().k(this.f36597c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36598a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36601d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f36600c = str;
            this.f36601d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new l(this.f36600c, this.f36601d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36598a;
            if (i10 == 0) {
                ut.x.b(obj);
                SignInChooserPresenter.this.getViewState().A2();
                SignInChooserPresenter.this.getViewState().e2();
                GoogleSingleSignOnAuthentication googleSingleSignOnAuthentication = new GoogleSingleSignOnAuthentication(this.f36600c, this.f36601d);
                SignInChooserPresenter signInChooserPresenter = SignInChooserPresenter.this;
                this.f36598a = 1;
                if (signInChooserPresenter.E2(googleSingleSignOnAuthentication, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36602a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Intent f36604c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Intent intent, zt.e eVar) {
            super(2, eVar);
            this.f36604c = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new m(this.f36604c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36602a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserPresenter.this.getViewState().d();
            SignInChooserPresenter.this.getViewState().K1(this.f36604c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36605a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInChooserPresenter.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36605a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            SignInChooserPresenter.this.getViewState().E7(SignInChooserPresenter.this.f36566a, SignInChooserPresenter.this.f36567b, SignInChooserPresenter.this.f36568c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36608b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f36610d;

        o(zt.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36608b = obj;
            this.f36610d |= RtlSpacingHelper.UNDEFINED;
            return SignInChooserPresenter.this.E2(null, this);
        }
    }

    public SignInChooserPresenter(int i10, boolean z10, boolean z11) {
        this.f36566a = i10;
        this.f36567b = z10;
        this.f36568c = z11;
        b2 b2Var = b2.f52944a;
        this.f36570e = new qi.c(new com.server.auditor.ssh.client.repositories.auth.h(b2Var.O1(), b2Var.B1()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E2(com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication r5, zt.e r6) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.server.auditor.ssh.client.presenters.account.SignInChooserPresenter.E2(com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication, zt.e):java.lang.Object");
    }

    public final void A2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void B2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    public final void C2(Intent intent) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(intent, null), 3, null);
    }

    @Override // nj.e.a
    public void D0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(null), 3, null);
    }

    @Override // nj.e.a
    public void D1(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(str, null), 3, null);
    }

    public final void D2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(null), 3, null);
    }

    @Override // nj.e.a
    public void T1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    @Override // nj.e.a
    public void Y1(String str, String str2) {
        t.f(str, "token");
        t.f(str2, "email");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(str2, str, null), 3, null);
    }

    @Override // nj.e.a
    public void f0(String str) {
        t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(str, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        getViewState().z(this.f36566a);
        this.f36569d.b5();
    }

    public final void v2(String str) {
        t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(str, null), 3, null);
    }

    public final void w2(String str, String str2) {
        t.f(str, "token");
        t.f(str2, "email");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(str2, str, null), 3, null);
    }

    public final void x2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void y2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }
}

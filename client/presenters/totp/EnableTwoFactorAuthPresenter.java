package com.server.auditor.ssh.client.presenters.totp;

import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.contracts.x2;
import hg.b2;
import jg.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class EnableTwoFactorAuthPresenter extends MvpPresenter<x2> implements p.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f38308e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f38309f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f38312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f38313d;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38314a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuthPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38314a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnableTwoFactorAuthPresenter.this.getViewState().j();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38316a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuthPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38316a;
            if (i10 == 0) {
                x.b(obj);
                EnableTwoFactorAuthPresenter.this.getViewState().d();
                p pVar = EnableTwoFactorAuthPresenter.this.f38313d;
                String str = EnableTwoFactorAuthPresenter.this.f38311b;
                String str2 = EnableTwoFactorAuthPresenter.this.f38310a;
                this.f38316a = 1;
                if (pVar.a(str, str2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38318a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuthPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38318a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnableTwoFactorAuthPresenter.this.getViewState().g1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38320a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuthPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38320a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnableTwoFactorAuthPresenter.this.getViewState().e();
            EnableTwoFactorAuthPresenter.this.getViewState().S0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38322a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuthPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38322a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnableTwoFactorAuthPresenter.this.getViewState().e();
            EnableTwoFactorAuthPresenter.this.getViewState().r0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38324a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38326c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f38326c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuthPresenter.this.new g(this.f38326c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38324a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnableTwoFactorAuthPresenter.this.getViewState().e();
            EnableTwoFactorAuthPresenter.this.getViewState().s(this.f38326c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38327a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuthPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38327a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnableTwoFactorAuthPresenter.this.getViewState().e();
            EnableTwoFactorAuthPresenter.this.getViewState().g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38329a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f38331c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, zt.e eVar) {
            super(2, eVar);
            this.f38331c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuthPresenter.this.new i(this.f38331c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38329a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnableTwoFactorAuthPresenter.this.getViewState().e();
            EnableTwoFactorAuthPresenter.this.getViewState().m(this.f38331c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38332a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuthPresenter.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38332a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnableTwoFactorAuthPresenter.this.getViewState().e();
            EnableTwoFactorAuthPresenter.this.getViewState().B0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38334a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuthPresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38334a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnableTwoFactorAuthPresenter.this.getViewState().e();
            EnableTwoFactorAuthPresenter.this.getViewState().h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38336a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38338c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, zt.e eVar) {
            super(2, eVar);
            this.f38338c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnableTwoFactorAuthPresenter.this.new l(this.f38338c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38336a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnableTwoFactorAuthPresenter.this.f38311b = this.f38338c;
            EnableTwoFactorAuthPresenter.this.getViewState().s(null);
            EnableTwoFactorAuthPresenter.this.getViewState().Vb(EnableTwoFactorAuthPresenter.this.w2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public EnableTwoFactorAuthPresenter(String str) {
        t.f(str, "token");
        this.f38310a = str;
        this.f38311b = "";
        this.f38312c = com.server.auditor.ssh.client.utils.analytics.a.y();
        b2 b2Var = b2.f52944a;
        ki.a aVar = new ki.a(b2Var.O1(), b2Var.B1());
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.f38313d = new p(aVar, dVarM, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w2() {
        return (this.f38311b.length() == 0 || s.m0(this.f38311b)) ? false : true;
    }

    public final void A2(String str) {
        t.f(str, "code");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(str, null), 3, null);
    }

    @Override // jg.p.a
    public void K0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // kj.g
    public void L(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(str, null), 3, null);
    }

    @Override // kj.g
    public void L1(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(i10, null), 3, null);
    }

    @Override // kj.g
    public void O1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    @Override // kj.g
    public void V() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(null), 3, null);
    }

    @Override // jg.p.a
    public void o2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        this.f38312c.W2();
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void attachView(x2 x2Var) {
        super.attachView(x2Var);
        getViewState().i();
    }

    public final void x2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void y2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    @Override // kj.g
    public void z() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    public final void z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }
}

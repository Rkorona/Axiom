package com.server.auditor.ssh.client.presenters.totp;

import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.contracts.v2;
import hg.b2;
import iu.p;
import jg.o;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class DisableTwoFactorAuthPresenter extends MvpPresenter<v2> implements o.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f38278d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38279e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f38282c;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38283a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuthPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38283a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DisableTwoFactorAuthPresenter.this.getViewState().j();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38285a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuthPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f38285a;
            if (i10 == 0) {
                x.b(obj);
                DisableTwoFactorAuthPresenter.this.getViewState().d();
                o oVar = DisableTwoFactorAuthPresenter.this.f38282c;
                String str = DisableTwoFactorAuthPresenter.this.f38281b;
                String str2 = DisableTwoFactorAuthPresenter.this.f38280a;
                this.f38285a = 1;
                if (oVar.a(str, str2, this) == objF) {
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

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38287a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuthPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38287a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DisableTwoFactorAuthPresenter.this.getViewState().g1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38289a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuthPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38289a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DisableTwoFactorAuthPresenter.this.getViewState().e();
            DisableTwoFactorAuthPresenter.this.getViewState().S0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38291a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuthPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38291a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DisableTwoFactorAuthPresenter.this.getViewState().e();
            DisableTwoFactorAuthPresenter.this.getViewState().r0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38293a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38295c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f38295c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuthPresenter.this.new g(this.f38295c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38293a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DisableTwoFactorAuthPresenter.this.getViewState().e();
            DisableTwoFactorAuthPresenter.this.getViewState().s(this.f38295c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38296a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuthPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38296a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DisableTwoFactorAuthPresenter.this.getViewState().e();
            DisableTwoFactorAuthPresenter.this.getViewState().g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38298a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f38300c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, zt.e eVar) {
            super(2, eVar);
            this.f38300c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuthPresenter.this.new i(this.f38300c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38298a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DisableTwoFactorAuthPresenter.this.getViewState().e();
            DisableTwoFactorAuthPresenter.this.getViewState().m(this.f38300c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38301a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuthPresenter.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38301a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DisableTwoFactorAuthPresenter.this.getViewState().e();
            DisableTwoFactorAuthPresenter.this.getViewState().B0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38303a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuthPresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38303a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DisableTwoFactorAuthPresenter.this.getViewState().e();
            DisableTwoFactorAuthPresenter.this.getViewState().h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f38305a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f38307c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, zt.e eVar) {
            super(2, eVar);
            this.f38307c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return DisableTwoFactorAuthPresenter.this.new l(this.f38307c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f38305a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DisableTwoFactorAuthPresenter.this.f38281b = this.f38307c;
            DisableTwoFactorAuthPresenter.this.getViewState().s(null);
            DisableTwoFactorAuthPresenter.this.getViewState().t(DisableTwoFactorAuthPresenter.this.w2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public DisableTwoFactorAuthPresenter(String str) {
        t.f(str, "token");
        this.f38280a = str;
        this.f38281b = "";
        b2 b2Var = b2.f52944a;
        ki.a aVar = new ki.a(b2Var.O1(), b2Var.B1());
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        this.f38282c = new o(aVar, dVarM, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean w2() {
        return (this.f38281b.length() == 0 || s.m0(this.f38281b)) ? false : true;
    }

    public final void A2(String str) {
        t.f(str, "code");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(str, null), 3, null);
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

    @Override // jg.o.a
    public void M0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // kj.g
    public void O1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    @Override // kj.g
    public void V() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
    }

    @Override // jg.o.a
    public void r1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: v2, reason: merged with bridge method [inline-methods] */
    public void attachView(v2 v2Var) {
        super.attachView(v2Var);
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

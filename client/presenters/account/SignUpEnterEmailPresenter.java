package com.server.auditor.ssh.client.presenters.account;

import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.account.f0;
import com.server.auditor.ssh.client.help.a0;
import com.server.auditor.ssh.client.interactors.c1;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.models.account.SecurityToken;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import hg.b2;
import ij.a;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class SignUpEnterEmailPresenter extends MvpPresenter<f0> implements a.InterfaceC0828a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36767d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f36768e = com.server.auditor.ssh.client.utils.analytics.a.y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c1 f36769f = new c1();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ij.a f36770u;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36771a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36771a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpEnterEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36773a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36775c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, zt.e eVar) {
            super(2, eVar);
            this.f36775c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailPresenter.this.new b(this.f36775c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36773a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpEnterEmailPresenter.this.getViewState().e();
            SignUpEnterEmailPresenter.this.getViewState().C(new a0.b(this.f36775c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36776a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36778c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f36778c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailPresenter.this.new c(this.f36778c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36776a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpEnterEmailPresenter.this.getViewState().e();
            SignUpEnterEmailPresenter.this.getViewState().C1(SignUpEnterEmailPresenter.this.f36764a, new EmailAuthentication(this.f36778c, (String) null, (SecurityToken) null, (String) null, 14, (ju.k) null), SignUpEnterEmailPresenter.this.f36765b, SignUpEnterEmailPresenter.this.f36766c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36779a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36779a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpEnterEmailPresenter.this.getViewState().e();
            SignUpEnterEmailPresenter.this.getViewState().C(new a0.a(R.string.toast_internet_available, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36781a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36781a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpEnterEmailPresenter.this.getViewState().e();
            SignUpEnterEmailPresenter.this.getViewState().D();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36783a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f36785c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f36785c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailPresenter.this.new f(this.f36785c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36783a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpEnterEmailPresenter.this.getViewState().e();
            if (this.f36785c) {
                SignUpEnterEmailPresenter.this.getViewState().t0(SignUpEnterEmailPresenter.this.f36764a, new EmailAuthentication(SignUpEnterEmailPresenter.this.f36767d, (String) null, (SecurityToken) null, (String) null, 14, (ju.k) null), SignUpEnterEmailPresenter.this.f36765b, SignUpEnterEmailPresenter.this.f36766c);
            } else {
                SignUpEnterEmailPresenter.this.getViewState().Id(SignUpEnterEmailPresenter.this.f36764a, new EmailAuthentication(SignUpEnterEmailPresenter.this.f36767d, (String) null, (SecurityToken) null, (String) null, 14, (ju.k) null), SignUpEnterEmailPresenter.this.f36765b, SignUpEnterEmailPresenter.this.f36766c);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36786a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36786a;
            if (i10 == 0) {
                x.b(obj);
                SignUpEnterEmailPresenter signUpEnterEmailPresenter = SignUpEnterEmailPresenter.this;
                String str = signUpEnterEmailPresenter.f36767d;
                this.f36786a = 1;
                if (signUpEnterEmailPresenter.E2(str, null, this) == objF) {
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
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36788a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36790c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, zt.e eVar) {
            super(2, eVar);
            this.f36790c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailPresenter.this.new h(this.f36790c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36788a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpEnterEmailPresenter.this.f36767d = s.n1(this.f36790c).toString();
            SignUpEnterEmailPresenter.this.getViewState().P(!s.m0(SignUpEnterEmailPresenter.this.f36767d));
            SignUpEnterEmailPresenter.this.getViewState().C(null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36791a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36791a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpEnterEmailPresenter.this.getViewState().l();
            SignUpEnterEmailPresenter.this.getViewState().F();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36793a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36795c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, zt.e eVar) {
            super(2, eVar);
            this.f36795c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailPresenter.this.new j(this.f36795c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36793a;
            if (i10 == 0) {
                x.b(obj);
                SignUpEnterEmailPresenter signUpEnterEmailPresenter = SignUpEnterEmailPresenter.this;
                String str = signUpEnterEmailPresenter.f36767d;
                String str2 = this.f36795c;
                this.f36793a = 1;
                if (signUpEnterEmailPresenter.E2(str, str2, this) == objF) {
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
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36796a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailPresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36796a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignUpEnterEmailPresenter.this.getViewState().N(SignUpEnterEmailPresenter.this.f36764a, SignUpEnterEmailPresenter.this.f36766c, SignUpEnterEmailPresenter.this.f36765b);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36798a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36801d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f36800c = str;
            this.f36801d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignUpEnterEmailPresenter.this.new l(this.f36800c, this.f36801d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36798a;
            if (i10 == 0) {
                x.b(obj);
                ij.a aVar = SignUpEnterEmailPresenter.this.f36770u;
                String str = this.f36800c;
                String str2 = this.f36801d;
                this.f36798a = 1;
                if (aVar.a(str, str2, this) == objF) {
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
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SignUpEnterEmailPresenter(int i10, boolean z10, boolean z11) {
        this.f36764a = i10;
        this.f36765b = z10;
        this.f36766c = z11;
        b2 b2Var = b2.f52944a;
        this.f36770u = new ij.a(new sl.b(b2Var.P1(), b2Var.B1()), new com.server.auditor.ssh.client.repositories.auth.b(b2Var.P1(), b2Var.B1()), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E2(String str, String str2, zt.e eVar) {
        com.server.auditor.ssh.client.models.a0 a0VarA = this.f36769f.a(str);
        getViewState().C(a0VarA.a());
        if (a0VarA.b()) {
            getViewState().l();
            getViewState().d();
            wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(str, str2, null), 3, null);
        }
        return m0.f82633a;
    }

    public final void A2(String str) {
        t.f(str, "rawEmail");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(str, null), 3, null);
    }

    public final void B2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    public final void C2(String str) {
        t.f(str, "responseToken");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(str, null), 3, null);
    }

    public final void D2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    @Override // ij.a.InterfaceC0828a
    public void F1(String str) {
        t.f(str, "email");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(str, null), 3, null);
    }

    @Override // ij.a.InterfaceC0828a
    public void M1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    @Override // ij.a.InterfaceC0828a
    public void P0(boolean z10, String str) {
        t.f(str, "email");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(z10, null), 3, null);
    }

    @Override // ij.a.InterfaceC0828a
    public void h1(String str) {
        t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // ij.a.InterfaceC0828a
    public void n2(String str) {
        t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(str, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        getViewState().P(!s.m0(this.f36767d));
        getViewState().z(this.f36764a);
        this.f36768e.e2(Avo.AuthMethod.EMAIL);
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public void attachView(f0 f0Var) {
        super.attachView(f0Var);
        getViewState().i();
    }

    public final void y2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }
}

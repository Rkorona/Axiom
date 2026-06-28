package com.server.auditor.ssh.client.presenters.account;

import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.account.z;
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
public final class SignInEnterEmailPresenter extends MvpPresenter<z> implements a.InterfaceC0828a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f36614d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f36615e = com.server.auditor.ssh.client.utils.analytics.a.y();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c1 f36616f = new c1();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ij.a f36617u;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36618a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36618a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignInEnterEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36620a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36622c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, zt.e eVar) {
            super(2, eVar);
            this.f36622c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailPresenter.this.new b(this.f36622c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36620a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignInEnterEmailPresenter.this.getViewState().e();
            SignInEnterEmailPresenter.this.getViewState().C(new a0.b(this.f36622c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36623a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36625c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f36625c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailPresenter.this.new c(this.f36625c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36623a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignInEnterEmailPresenter.this.getViewState().e();
            SignInEnterEmailPresenter.this.getViewState().C1(SignInEnterEmailPresenter.this.f36611a, new EmailAuthentication(this.f36625c, (String) null, (SecurityToken) null, (String) null, 14, (ju.k) null), SignInEnterEmailPresenter.this.f36613c, SignInEnterEmailPresenter.this.f36612b);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36626a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36626a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignInEnterEmailPresenter.this.getViewState().e();
            SignInEnterEmailPresenter.this.getViewState().C(new a0.a(R.string.toast_internet_available, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36628a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36628a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignInEnterEmailPresenter.this.getViewState().e();
            SignInEnterEmailPresenter.this.getViewState().D();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36630a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f36632c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f36632c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailPresenter.this.new f(this.f36632c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36630a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignInEnterEmailPresenter.this.getViewState().e();
            if (this.f36632c) {
                SignInEnterEmailPresenter.this.getViewState().t0(SignInEnterEmailPresenter.this.f36611a, new EmailAuthentication(SignInEnterEmailPresenter.this.f36614d, (String) null, (SecurityToken) null, (String) null, 14, (ju.k) null), SignInEnterEmailPresenter.this.f36613c, SignInEnterEmailPresenter.this.f36612b);
            } else {
                SignInEnterEmailPresenter.this.getViewState().L3(SignInEnterEmailPresenter.this.f36611a, new EmailAuthentication(SignInEnterEmailPresenter.this.f36614d, (String) null, (SecurityToken) null, (String) null, 14, (ju.k) null), SignInEnterEmailPresenter.this.f36613c, SignInEnterEmailPresenter.this.f36612b);
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
        int f36633a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36633a;
            if (i10 == 0) {
                x.b(obj);
                SignInEnterEmailPresenter signInEnterEmailPresenter = SignInEnterEmailPresenter.this;
                String str = signInEnterEmailPresenter.f36614d;
                this.f36633a = 1;
                if (signInEnterEmailPresenter.D2(str, null, this) == objF) {
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
        int f36635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f36636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SignInEnterEmailPresenter f36637c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, SignInEnterEmailPresenter signInEnterEmailPresenter, zt.e eVar) {
            super(2, eVar);
            this.f36636b = str;
            this.f36637c = signInEnterEmailPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f36636b, this.f36637c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36635a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!t.b(this.f36636b, this.f36637c.f36614d)) {
                this.f36637c.f36614d = s.n1(this.f36636b).toString();
                this.f36637c.getViewState().P(!s.m0(this.f36637c.f36614d));
                this.f36637c.getViewState().C(null);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36638a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36638a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SignInEnterEmailPresenter.this.getViewState().l();
            SignInEnterEmailPresenter.this.getViewState().F();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36640a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36642c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, zt.e eVar) {
            super(2, eVar);
            this.f36642c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailPresenter.this.new j(this.f36642c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36640a;
            if (i10 == 0) {
                x.b(obj);
                SignInEnterEmailPresenter signInEnterEmailPresenter = SignInEnterEmailPresenter.this;
                String str = signInEnterEmailPresenter.f36614d;
                String str2 = this.f36642c;
                this.f36640a = 1;
                if (signInEnterEmailPresenter.D2(str, str2, this) == objF) {
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
        int f36643a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f36646d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f36645c = str;
            this.f36646d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SignInEnterEmailPresenter.this.new k(this.f36645c, this.f36646d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36643a;
            if (i10 == 0) {
                x.b(obj);
                ij.a aVar = SignInEnterEmailPresenter.this.f36617u;
                String str = this.f36645c;
                String str2 = this.f36646d;
                this.f36643a = 1;
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
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SignInEnterEmailPresenter(int i10, boolean z10, boolean z11) {
        this.f36611a = i10;
        this.f36612b = z10;
        this.f36613c = z11;
        b2 b2Var = b2.f52944a;
        this.f36617u = new ij.a(new sl.b(b2Var.P1(), b2Var.B1()), new com.server.auditor.ssh.client.repositories.auth.b(b2Var.P1(), b2Var.B1()), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D2(String str, String str2, zt.e eVar) {
        com.server.auditor.ssh.client.models.a0 a0VarA = this.f36616f.a(str);
        getViewState().C(a0VarA.a());
        if (a0VarA.b()) {
            getViewState().l();
            getViewState().d();
            wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(str, str2, null), 3, null);
        }
        return m0.f82633a;
    }

    public final void A2(String str) {
        t.f(str, "rawEmail");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(str, this, null), 3, null);
    }

    public final void B2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    public final void C2(String str) {
        t.f(str, "responseToken");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(str, null), 3, null);
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
        getViewState().P(!s.m0(this.f36614d));
        getViewState().z(this.f36611a);
        this.f36615e.e2(Avo.AuthMethod.EMAIL);
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public void attachView(z zVar) {
        super.attachView(zVar);
        getViewState().i();
    }

    public final void y2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }
}

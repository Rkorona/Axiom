package com.server.auditor.ssh.client.presenters.account;

import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.account.v;
import com.server.auditor.ssh.client.help.a0;
import com.server.auditor.ssh.client.interactors.c1;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication;
import hg.b2;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import qi.h;
import ut.m0;
import ut.s;
import ut.x;
import wu.i0;
import wu.k;

/* JADX INFO: loaded from: classes4.dex */
public final class ResetPasswordPresenter extends MvpPresenter<v> implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AuthenticationModel f36542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f36544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f36545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c1 f36546f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final qi.h f36547u;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36548a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36548a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetPasswordPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36550a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36550a;
            if (i10 == 0) {
                x.b(obj);
                ResetPasswordPresenter resetPasswordPresenter = ResetPasswordPresenter.this;
                String str = resetPasswordPresenter.f36545e;
                this.f36550a = 1;
                if (resetPasswordPresenter.y2(str, this) == objF) {
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
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36552a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36552a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetPasswordPresenter.this.getViewState().e();
            ResetPasswordPresenter.this.getViewState().Z(new a0.a(R.string.login_registration_unexpected_error, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36554a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36556c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, zt.e eVar) {
            super(2, eVar);
            this.f36556c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordPresenter.this.new d(this.f36556c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36554a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetPasswordPresenter.this.getViewState().e();
            ResetPasswordPresenter.this.getViewState().Z(new a0.b(this.f36556c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36557a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36557a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetPasswordPresenter.this.getViewState().e();
            ResetPasswordPresenter.this.getViewState().Z(new a0.a(R.string.toast_internet_available, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36559a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36559a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetPasswordPresenter.this.getViewState().e();
            ResetPasswordPresenter.this.getViewState().D5(ResetPasswordPresenter.this.f36541a, ResetPasswordPresenter.this.f36542b, ResetPasswordPresenter.this.f36544d, ResetPasswordPresenter.this.f36543c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36561a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f36563c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, zt.e eVar) {
            super(2, eVar);
            this.f36563c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordPresenter.this.new g(this.f36563c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36561a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetPasswordPresenter.this.getViewState().e();
            ResetPasswordPresenter.this.getViewState().Z(new a0.a(R.string.new_crypto_migration_security_token_throttled_mm_ss, tp.i0.a(this.f36563c)));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36564a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetPasswordPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36564a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetPasswordPresenter.this.getViewState().e();
            ResetPasswordPresenter.this.getViewState().Z(new a0.a(R.string.login_registration_unexpected_error, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ResetPasswordPresenter(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        t.f(authenticationModel, "authenticationModel");
        this.f36541a = i10;
        this.f36542b = authenticationModel;
        this.f36543c = z10;
        this.f36544d = z11;
        this.f36545e = "";
        this.f36546f = new c1();
        b2 b2Var = b2.f52944a;
        this.f36547u = new qi.h(new com.server.auditor.ssh.client.repositories.auth.m(b2Var.P1(), b2Var.B1()), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y2(String str, zt.e eVar) {
        com.server.auditor.ssh.client.models.a0 a0VarA = this.f36546f.a(str);
        getViewState().Z(a0VarA.a());
        if (!a0VarA.b()) {
            return m0.f82633a;
        }
        getViewState().d();
        Object objA = this.f36547u.a(str, eVar);
        return objA == au.b.f() ? objA : m0.f82633a;
    }

    @Override // qi.h.a
    public void K1(String str) {
        t.f(str, "error");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(str, null), 3, null);
    }

    @Override // qi.h.a
    public void U1(Exception exc) {
        t.f(exc, "e");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // qi.h.a
    public void X0(Exception exc) {
        t.f(exc, "e");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    @Override // qi.h.a
    public void e0() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        String email;
        super.onFirstViewAttach();
        getViewState().c();
        AuthenticationModel authenticationModel = this.f36542b;
        if (authenticationModel instanceof EmailAuthentication) {
            email = ((EmailAuthentication) authenticationModel).getEmail();
        } else if (authenticationModel instanceof EnterpriseSingleSignOnAuthentication) {
            email = ((EnterpriseSingleSignOnAuthentication) authenticationModel).getEmail();
        } else {
            if (!(authenticationModel instanceof FirebaseSingleSignOnAuthentication)) {
                throw new s();
            }
            email = ((FirebaseSingleSignOnAuthentication) authenticationModel).getEmail();
        }
        if (email.length() > 0) {
            this.f36545e = email;
        }
        getViewState().H0(this.f36545e);
    }

    public final void w2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    @Override // qi.h.a
    public void x(int i10) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(i10, null), 3, null);
    }

    @Override // qi.h.a
    public void x1() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    public final void x2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}

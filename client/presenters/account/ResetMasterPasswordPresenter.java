package com.server.auditor.ssh.client.presenters.account;

import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.account.r;
import com.server.auditor.ssh.client.help.a0;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import hg.b2;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import qi.h;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;

/* JADX INFO: loaded from: classes4.dex */
public final class ResetMasterPasswordPresenter extends MvpPresenter<r> implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EmailAuthentication f36516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f36517b;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36518a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36518a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetMasterPasswordPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36520a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36520a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetMasterPasswordPresenter.this.getViewState().e();
            ResetMasterPasswordPresenter.this.getViewState().Z(new a0.a(R.string.login_registration_unexpected_error, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36522a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36524c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f36524c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordPresenter.this.new c(this.f36524c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36522a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetMasterPasswordPresenter.this.getViewState().e();
            ResetMasterPasswordPresenter.this.getViewState().Z(new a0.b(this.f36524c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36525a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36525a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetMasterPasswordPresenter.this.getViewState().e();
            ResetMasterPasswordPresenter.this.getViewState().Z(new a0.a(R.string.toast_internet_available, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36527a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36527a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetMasterPasswordPresenter.this.getViewState().e();
            ResetMasterPasswordPresenter.this.getViewState().H6(ResetMasterPasswordPresenter.this.f36516a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36529a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36529a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetMasterPasswordPresenter.this.getViewState().e();
            ResetMasterPasswordPresenter.this.getViewState().Z(new a0.a(R.string.login_registration_unexpected_error, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36531a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ResetMasterPasswordPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36531a;
            if (i10 == 0) {
                x.b(obj);
                ResetMasterPasswordPresenter.this.getViewState().d();
                h hVar = ResetMasterPasswordPresenter.this.f36517b;
                String email = ResetMasterPasswordPresenter.this.f36516a.getEmail();
                this.f36531a = 1;
                if (hVar.a(email, this) == objF) {
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

    public ResetMasterPasswordPresenter(EmailAuthentication emailAuthentication) {
        t.f(emailAuthentication, "emailAuthentication");
        this.f36516a = emailAuthentication;
        b2 b2Var = b2.f52944a;
        this.f36517b = new h(new com.server.auditor.ssh.client.repositories.auth.m(b2Var.P1(), b2Var.B1()), this);
    }

    @Override // qi.h.a
    public void K1(String str) {
        t.f(str, "error");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(str, null), 3, null);
    }

    @Override // qi.h.a
    public void U1(Exception exc) {
        t.f(exc, "e");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    @Override // qi.h.a
    public void X0(Exception exc) {
        t.f(exc, "e");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    @Override // qi.h.a
    public void e0() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().c();
        getViewState().H0(this.f36516a.getEmail());
    }

    public final void s2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void t2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    @Override // qi.h.a
    public void x(int i10) {
        getViewState().e();
        getViewState().Z(new a0.a(R.string.new_crypto_migration_security_token_throttled_mm_ss, tp.i0.a(i10)));
    }

    @Override // qi.h.a
    public void x1() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }
}

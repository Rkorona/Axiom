package com.server.auditor.ssh.client.presenters.account;

import com.server.auditor.ssh.client.contracts.account.f;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.s;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class AlreadyHaveAnAccountPresenter extends MvpPresenter<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AuthenticationModel f36363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f36365d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36366a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return AlreadyHaveAnAccountPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36366a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            AlreadyHaveAnAccountPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36368a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return AlreadyHaveAnAccountPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36368a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            AlreadyHaveAnAccountPresenter.this.getViewState().va(AlreadyHaveAnAccountPresenter.this.f36362a, AlreadyHaveAnAccountPresenter.this.f36363b, AlreadyHaveAnAccountPresenter.this.f36364c, AlreadyHaveAnAccountPresenter.this.f36365d);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36370a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return AlreadyHaveAnAccountPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36370a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            AlreadyHaveAnAccountPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public AlreadyHaveAnAccountPresenter(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        t.f(authenticationModel, "authenticationModel");
        this.f36362a = i10;
        this.f36363b = authenticationModel;
        this.f36364c = z10;
        this.f36365d = z11;
    }

    private final String u2(AuthenticationModel authenticationModel) {
        if (authenticationModel instanceof EmailAuthentication) {
            return ((EmailAuthentication) authenticationModel).getEmail();
        }
        if (authenticationModel instanceof EnterpriseSingleSignOnAuthentication) {
            return ((EnterpriseSingleSignOnAuthentication) authenticationModel).getEmail();
        }
        if (authenticationModel instanceof FirebaseSingleSignOnAuthentication) {
            return ((FirebaseSingleSignOnAuthentication) authenticationModel).getEmail();
        }
        throw new s();
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().u(u2(this.f36363b));
    }

    public final void v2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void w2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void x2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }
}

package com.server.auditor.ssh.client.presenters.account;

import com.server.auditor.ssh.client.contracts.account.j;
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
public final class DontHaveAnAccountPresenter extends MvpPresenter<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AuthenticationModel f36382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f36384d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36385a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return DontHaveAnAccountPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36385a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DontHaveAnAccountPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36387a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return DontHaveAnAccountPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36387a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DontHaveAnAccountPresenter.this.getViewState().sc(DontHaveAnAccountPresenter.this.f36381a, DontHaveAnAccountPresenter.this.f36382b, DontHaveAnAccountPresenter.this.f36383c, DontHaveAnAccountPresenter.this.f36384d);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36389a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return DontHaveAnAccountPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36389a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            DontHaveAnAccountPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public DontHaveAnAccountPresenter(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        t.f(authenticationModel, "authenticationModel");
        this.f36381a = i10;
        this.f36382b = authenticationModel;
        this.f36383c = z10;
        this.f36384d = z11;
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
        getViewState().u(u2(this.f36382b));
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

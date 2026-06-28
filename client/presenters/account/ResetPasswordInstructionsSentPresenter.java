package com.server.auditor.ssh.client.presenters.account;

import com.server.auditor.ssh.client.contracts.account.t;
import com.server.auditor.ssh.client.models.account.AuthenticationModel;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.FirebaseSingleSignOnAuthentication;
import iu.p;
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
public final class ResetPasswordInstructionsSentPresenter extends MvpPresenter<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AuthenticationModel f36534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f36536d;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36537a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ResetPasswordInstructionsSentPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36537a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetPasswordInstructionsSentPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36539a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ResetPasswordInstructionsSentPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36539a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetPasswordInstructionsSentPresenter.this.getViewState().r4(ResetPasswordInstructionsSentPresenter.this.f36533a, ResetPasswordInstructionsSentPresenter.this.f36534b, ResetPasswordInstructionsSentPresenter.this.f36536d, ResetPasswordInstructionsSentPresenter.this.f36535c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ResetPasswordInstructionsSentPresenter(int i10, AuthenticationModel authenticationModel, boolean z10, boolean z11) {
        ju.t.f(authenticationModel, "authenticationModel");
        this.f36533a = i10;
        this.f36534b = authenticationModel;
        this.f36535c = z10;
        this.f36536d = z11;
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
        getViewState().u(u2(this.f36534b));
    }

    public final void v2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void w2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}

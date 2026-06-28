package com.server.auditor.ssh.client.presenters.account;

import com.server.auditor.ssh.client.contracts.account.p;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class ResetMasterPasswordInstructionsSentPresenter extends MvpPresenter<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EmailAuthentication f36511a;

    static final class a extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36512a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ResetMasterPasswordInstructionsSentPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36512a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetMasterPasswordInstructionsSentPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36514a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return ResetMasterPasswordInstructionsSentPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36514a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ResetMasterPasswordInstructionsSentPresenter.this.getViewState().S3(ResetMasterPasswordInstructionsSentPresenter.this.f36511a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ResetMasterPasswordInstructionsSentPresenter(EmailAuthentication emailAuthentication) {
        t.f(emailAuthentication, "emailAuthentication");
        this.f36511a = emailAuthentication;
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().u(this.f36511a.getEmail());
    }

    public final void r2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void s2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}

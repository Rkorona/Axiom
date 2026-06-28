package com.server.auditor.ssh.client.presenters.biometrickeys;

import com.server.auditor.ssh.client.contracts.views.biometrickeys.f;
import com.server.auditor.ssh.client.database.adapters.SshKeyDBAdapter;
import hg.b2;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ri.a;
import ri.h;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import wu.x0;
import zt.e;

/* JADX INFO: loaded from: classes4.dex */
public final class KeepBiometricKeysAfterLogoutPresenter extends MvpPresenter<f> implements a.InterfaceC1190a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f37239a = b2.f52944a.z1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ri.a f37240b;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37241a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return KeepBiometricKeysAfterLogoutPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37241a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            KeepBiometricKeysAfterLogoutPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37243a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37245c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, e eVar) {
            super(2, eVar);
            this.f37245c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return KeepBiometricKeysAfterLogoutPresenter.this.new b(this.f37245c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37243a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            KeepBiometricKeysAfterLogoutPresenter.this.getViewState().L4(this.f37245c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37246a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return KeepBiometricKeysAfterLogoutPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37246a;
            if (i10 == 0) {
                x.b(obj);
                ri.a aVar = KeepBiometricKeysAfterLogoutPresenter.this.f37240b;
                this.f37246a = 1;
                if (aVar.b(this) == objF) {
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
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37248a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f37250c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z10, e eVar) {
            super(2, eVar);
            this.f37250c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return KeepBiometricKeysAfterLogoutPresenter.this.new d(this.f37250c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37248a;
            if (i10 == 0) {
                x.b(obj);
                KeepBiometricKeysAfterLogoutPresenter.this.getViewState().d();
                h hVar = KeepBiometricKeysAfterLogoutPresenter.this.f37239a;
                boolean z10 = this.f37250c;
                this.f37248a = 1;
                if (hVar.d(z10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            KeepBiometricKeysAfterLogoutPresenter.this.getViewState().e();
            KeepBiometricKeysAfterLogoutPresenter.this.getViewState().h0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public KeepBiometricKeysAfterLogoutPresenter() {
        SshKeyDBAdapter sshKeyDBAdapterW = hg.f.p().W();
        t.e(sshKeyDBAdapterW, "getSshKeyDBAdapter(...)");
        this.f37240b = new ri.a(sshKeyDBAdapterW, x0.b(), this);
    }

    @Override // ri.a.InterfaceC1190a
    public void A(int i10) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(i10, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().c();
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void s2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void t2(boolean z10) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(z10, null), 3, null);
    }
}

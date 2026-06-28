package com.server.auditor.ssh.client.presenters;

import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.contracts.b3;
import hg.b2;
import iu.p;
import jg.q;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;

/* JADX INFO: loaded from: classes4.dex */
public final class EnterPhoneNumberTwoFactorAuthPresenter extends MvpPresenter<b3> implements q.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f35526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f35527c;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35528a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuthPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35528a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterPhoneNumberTwoFactorAuthPresenter.this.getViewState().j();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35530a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35532c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, zt.e eVar) {
            super(2, eVar);
            this.f35532c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuthPresenter.this.new b(this.f35532c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35530a;
            if (i10 == 0) {
                x.b(obj);
                EnterPhoneNumberTwoFactorAuthPresenter.this.getViewState().L0();
                q qVar = EnterPhoneNumberTwoFactorAuthPresenter.this.f35527c;
                String str = this.f35532c;
                String str2 = EnterPhoneNumberTwoFactorAuthPresenter.this.f35525a;
                this.f35530a = 1;
                if (qVar.b(str, str2, this) == objF) {
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
        int f35533a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuthPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35533a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterPhoneNumberTwoFactorAuthPresenter.this.f35526b.U2();
            EnterPhoneNumberTwoFactorAuthPresenter.this.getViewState().a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35535a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35537c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, zt.e eVar) {
            super(2, eVar);
            this.f35537c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuthPresenter.this.new d(this.f35537c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35535a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterPhoneNumberTwoFactorAuthPresenter.this.getViewState().b2();
            EnterPhoneNumberTwoFactorAuthPresenter.this.getViewState().T6(this.f35537c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35538a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuthPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35538a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterPhoneNumberTwoFactorAuthPresenter.this.getViewState().b2();
            EnterPhoneNumberTwoFactorAuthPresenter.this.getViewState().g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35540a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuthPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35540a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterPhoneNumberTwoFactorAuthPresenter.this.getViewState().b2();
            EnterPhoneNumberTwoFactorAuthPresenter.this.getViewState().d7();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35542a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterPhoneNumberTwoFactorAuthPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35542a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterPhoneNumberTwoFactorAuthPresenter.this.getViewState().b2();
            EnterPhoneNumberTwoFactorAuthPresenter.this.getViewState().h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public EnterPhoneNumberTwoFactorAuthPresenter(String str) {
        t.f(str, "token");
        this.f35525a = str;
        this.f35526b = com.server.auditor.ssh.client.utils.analytics.a.y();
        b2 b2Var = b2.f52944a;
        this.f35527c = new q(new ki.b(b2Var.O1(), b2Var.B1()), this);
    }

    @Override // jg.q.a
    public void L0() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // jg.q.a
    public void Y0() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    @Override // jg.q.a
    public void k2(String str) {
        t.f(str, "token");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    @Override // jg.q.a
    public void p2(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(str, null), 3, null);
    }

    public final void t2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void u2(String str) {
        t.f(str, "phoneValue");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(str, null), 3, null);
    }
}

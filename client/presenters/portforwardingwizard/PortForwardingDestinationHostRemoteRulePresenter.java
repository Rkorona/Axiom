package com.server.auditor.ssh.client.presenters.portforwardingwizard;

import android.text.TextUtils;
import com.server.auditor.ssh.client.contracts.portforwardingwizard.t;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
import iu.p;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zi.b;

/* JADX INFO: loaded from: classes4.dex */
public final class PortForwardingDestinationHostRemoteRulePresenter extends MvpPresenter<t> implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PortForwardingWizardData f37653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zi.b f37654b;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f37656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingDestinationHostRemoteRulePresenter f37657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CharSequence charSequence, PortForwardingDestinationHostRemoteRulePresenter portForwardingDestinationHostRemoteRulePresenter, zt.e eVar) {
            super(2, eVar);
            this.f37656b = charSequence;
            this.f37657c = portForwardingDestinationHostRemoteRulePresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(this.f37656b, this.f37657c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37655a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            CharSequence charSequence = this.f37656b;
            if (charSequence != null) {
                PortForwardingDestinationHostRemoteRulePresenter portForwardingDestinationHostRemoteRulePresenter = this.f37657c;
                portForwardingDestinationHostRemoteRulePresenter.r2().setDestinationAddress(charSequence.toString());
                if (charSequence.length() <= 0 || s.m0(charSequence)) {
                    portForwardingDestinationHostRemoteRulePresenter.getViewState().y(false);
                } else {
                    portForwardingDestinationHostRemoteRulePresenter.getViewState().y(true);
                }
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37658a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDestinationHostRemoteRulePresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37658a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDestinationHostRemoteRulePresenter.this.getViewState().J(PortForwardingDestinationHostRemoteRulePresenter.this.r2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37660a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDestinationHostRemoteRulePresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37660a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDestinationHostRemoteRulePresenter.this.getViewState().m0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37662a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDestinationHostRemoteRulePresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37662a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            wj.a.f84960a.h();
            PortForwardingDestinationHostRemoteRulePresenter.this.getViewState().a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37664a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDestinationHostRemoteRulePresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37664a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDestinationHostRemoteRulePresenter.this.getViewState().w();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence f37668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PortForwardingDestinationHostRemoteRulePresenter f37669d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CharSequence charSequence, PortForwardingDestinationHostRemoteRulePresenter portForwardingDestinationHostRemoteRulePresenter, zt.e eVar) {
            super(2, eVar);
            this.f37668c = charSequence;
            this.f37669d = portForwardingDestinationHostRemoteRulePresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f37668c, this.f37669d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37667b;
            if (i10 == 0) {
                x.b(obj);
                CharSequence charSequence = this.f37668c;
                if (charSequence != null) {
                    PortForwardingDestinationHostRemoteRulePresenter portForwardingDestinationHostRemoteRulePresenter = this.f37669d;
                    if (charSequence.length() > 0 && !s.m0(charSequence) && TextUtils.isDigitsOnly(charSequence)) {
                        portForwardingDestinationHostRemoteRulePresenter.r2().setDestinationPortNumber(Integer.parseInt(charSequence.toString()));
                    }
                    zi.b bVar = portForwardingDestinationHostRemoteRulePresenter.f37654b;
                    this.f37666a = charSequence;
                    this.f37667b = 1;
                    if (bVar.a(charSequence, this) == objF) {
                        return objF;
                    }
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
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37670a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDestinationHostRemoteRulePresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37670a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDestinationHostRemoteRulePresenter.this.getViewState().Y1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37672a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDestinationHostRemoteRulePresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37672a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDestinationHostRemoteRulePresenter.this.getViewState().y(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37674a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDestinationHostRemoteRulePresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37674a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDestinationHostRemoteRulePresenter.this.getViewState().v();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public PortForwardingDestinationHostRemoteRulePresenter(PortForwardingWizardData portForwardingWizardData) {
        ju.t.f(portForwardingWizardData, "wizardData");
        this.f37653a = portForwardingWizardData;
        this.f37654b = new zi.b(this);
    }

    @Override // zi.b.a
    public void E0() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    @Override // zi.b.a
    public void Q1() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // zi.b.a
    public void V0() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    @Override // zi.b.a
    public void m1() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final PortForwardingWizardData r2() {
        return this.f37653a;
    }

    public final void s2(CharSequence charSequence) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(charSequence, this, null), 3, null);
    }

    public final void t2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void u2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void v2(CharSequence charSequence) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(charSequence, this, null), 3, null);
    }
}

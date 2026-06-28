package com.server.auditor.ssh.client.presenters.portforwardingwizard;

import android.text.TextUtils;
import com.server.auditor.ssh.client.contracts.portforwardingwizard.l;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
import iu.p;
import ju.t;
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
public final class PortForwardingDestinationHostLocalRulePresenter extends MvpPresenter<l> implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PortForwardingWizardData f37632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zi.b f37633b;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f37635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingDestinationHostLocalRulePresenter f37636c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CharSequence charSequence, PortForwardingDestinationHostLocalRulePresenter portForwardingDestinationHostLocalRulePresenter, zt.e eVar) {
            super(2, eVar);
            this.f37635b = charSequence;
            this.f37636c = portForwardingDestinationHostLocalRulePresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(this.f37635b, this.f37636c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37634a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            CharSequence charSequence = this.f37635b;
            if (charSequence != null) {
                PortForwardingDestinationHostLocalRulePresenter portForwardingDestinationHostLocalRulePresenter = this.f37636c;
                portForwardingDestinationHostLocalRulePresenter.r2().setDestinationAddress(charSequence.toString());
                if (charSequence.length() <= 0 || s.m0(charSequence)) {
                    portForwardingDestinationHostLocalRulePresenter.getViewState().y(false);
                } else {
                    portForwardingDestinationHostLocalRulePresenter.getViewState().y(true);
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
        int f37637a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDestinationHostLocalRulePresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37637a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDestinationHostLocalRulePresenter.this.getViewState().J(PortForwardingDestinationHostLocalRulePresenter.this.r2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37639a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDestinationHostLocalRulePresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37639a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDestinationHostLocalRulePresenter.this.getViewState().m0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37641a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDestinationHostLocalRulePresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37641a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDestinationHostLocalRulePresenter.this.getViewState().w();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f37643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence f37645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PortForwardingDestinationHostLocalRulePresenter f37646d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CharSequence charSequence, PortForwardingDestinationHostLocalRulePresenter portForwardingDestinationHostLocalRulePresenter, zt.e eVar) {
            super(2, eVar);
            this.f37645c = charSequence;
            this.f37646d = portForwardingDestinationHostLocalRulePresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new e(this.f37645c, this.f37646d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37644b;
            if (i10 == 0) {
                x.b(obj);
                CharSequence charSequence = this.f37645c;
                if (charSequence != null) {
                    PortForwardingDestinationHostLocalRulePresenter portForwardingDestinationHostLocalRulePresenter = this.f37646d;
                    if (charSequence.length() > 0 && !s.m0(charSequence) && TextUtils.isDigitsOnly(charSequence)) {
                        portForwardingDestinationHostLocalRulePresenter.r2().setDestinationPortNumber(Integer.parseInt(charSequence.toString()));
                    }
                    zi.b bVar = portForwardingDestinationHostLocalRulePresenter.f37633b;
                    this.f37643a = charSequence;
                    this.f37644b = 1;
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
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37647a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDestinationHostLocalRulePresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37647a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDestinationHostLocalRulePresenter.this.getViewState().Y1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37649a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDestinationHostLocalRulePresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37649a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDestinationHostLocalRulePresenter.this.getViewState().y(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37651a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDestinationHostLocalRulePresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37651a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDestinationHostLocalRulePresenter.this.getViewState().v();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public PortForwardingDestinationHostLocalRulePresenter(PortForwardingWizardData portForwardingWizardData) {
        t.f(portForwardingWizardData, "wizardData");
        this.f37632a = portForwardingWizardData;
        this.f37633b = new zi.b(this);
    }

    @Override // zi.b.a
    public void E0() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    @Override // zi.b.a
    public void Q1() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    @Override // zi.b.a
    public void V0() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    @Override // zi.b.a
    public void m1() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        wj.a.f84960a.d();
        getViewState().a();
    }

    public final PortForwardingWizardData r2() {
        return this.f37632a;
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
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(charSequence, this, null), 3, null);
    }
}

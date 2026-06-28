package com.server.auditor.ssh.client.presenters.portforwardingwizard;

import com.server.auditor.ssh.client.contracts.portforwardingwizard.r;
import com.server.auditor.ssh.client.navigation.portforwardingwizard.PortForwardingWizardData;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;
import zi.b;

/* JADX INFO: loaded from: classes4.dex */
public final class PortForwardingDataForRemoteRulePresenter extends MvpPresenter<r> implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PortForwardingWizardData f37597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zi.b f37598b;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f37600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence f37601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PortForwardingDataForRemoteRulePresenter f37602d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CharSequence charSequence, CharSequence charSequence2, PortForwardingDataForRemoteRulePresenter portForwardingDataForRemoteRulePresenter, zt.e eVar) {
            super(2, eVar);
            this.f37600b = charSequence;
            this.f37601c = charSequence2;
            this.f37602d = portForwardingDataForRemoteRulePresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(this.f37600b, this.f37601c, this.f37602d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37599a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            int i10 = Integer.parseInt(String.valueOf(this.f37600b));
            String strValueOf = String.valueOf(this.f37601c);
            this.f37602d.r2().setLocalPortNumber(i10);
            this.f37602d.r2().setBindAddress(strValueOf);
            this.f37602d.getViewState().Wa(this.f37602d.r2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37603a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForRemoteRulePresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37603a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            wj.a.f84960a.j();
            PortForwardingDataForRemoteRulePresenter.this.getViewState().a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37605a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForRemoteRulePresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37605a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDataForRemoteRulePresenter.this.getViewState().w();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f37608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingDataForRemoteRulePresenter f37609c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence, PortForwardingDataForRemoteRulePresenter portForwardingDataForRemoteRulePresenter, zt.e eVar) {
            super(2, eVar);
            this.f37608b = charSequence;
            this.f37609c = portForwardingDataForRemoteRulePresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f37608b, this.f37609c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37607a;
            if (i10 == 0) {
                x.b(obj);
                CharSequence charSequence = this.f37608b;
                if (charSequence != null) {
                    zi.b bVar = this.f37609c.f37598b;
                    this.f37607a = 1;
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
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37610a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForRemoteRulePresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37610a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDataForRemoteRulePresenter.this.getViewState().y(true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37612a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForRemoteRulePresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37612a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDataForRemoteRulePresenter.this.getViewState().y(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37614a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDataForRemoteRulePresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37614a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDataForRemoteRulePresenter.this.getViewState().v();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public PortForwardingDataForRemoteRulePresenter(PortForwardingWizardData portForwardingWizardData) {
        t.f(portForwardingWizardData, "wizardData");
        this.f37597a = portForwardingWizardData;
        this.f37598b = new zi.b(this);
    }

    @Override // zi.b.a
    public void E0() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // zi.b.a
    public void Q1() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    @Override // zi.b.a
    public void V0() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    @Override // zi.b.a
    public void m1() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final PortForwardingWizardData r2() {
        return this.f37597a;
    }

    public final void s2(CharSequence charSequence, CharSequence charSequence2) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(charSequence, charSequence2, this, null), 3, null);
    }

    public final void t2(CharSequence charSequence) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(charSequence, this, null), 3, null);
    }
}

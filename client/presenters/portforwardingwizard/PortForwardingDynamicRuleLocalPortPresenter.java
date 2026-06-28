package com.server.auditor.ssh.client.presenters.portforwardingwizard;

import android.text.TextUtils;
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
public final class PortForwardingDynamicRuleLocalPortPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.portforwardingwizard.f> implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PortForwardingWizardData f37681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zi.b f37682b;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f37684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence f37685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PortForwardingDynamicRuleLocalPortPresenter f37686d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CharSequence charSequence, CharSequence charSequence2, PortForwardingDynamicRuleLocalPortPresenter portForwardingDynamicRuleLocalPortPresenter, zt.e eVar) {
            super(2, eVar);
            this.f37684b = charSequence;
            this.f37685c = charSequence2;
            this.f37686d = portForwardingDynamicRuleLocalPortPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new a(this.f37684b, this.f37685c, this.f37686d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37683a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            CharSequence charSequence = this.f37684b;
            if (charSequence != null && TextUtils.isDigitsOnly(charSequence)) {
                int i10 = Integer.parseInt(this.f37684b.toString());
                String strValueOf = String.valueOf(this.f37685c);
                this.f37686d.f37681a.setLocalPortNumber(i10);
                this.f37686d.f37681a.setBindAddress(strValueOf);
                this.f37686d.getViewState().Q6(this.f37686d.f37681a);
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
        int f37687a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDynamicRuleLocalPortPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37687a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            wj.a.f84960a.b();
            PortForwardingDynamicRuleLocalPortPresenter.this.getViewState().a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37689a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDynamicRuleLocalPortPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37689a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDynamicRuleLocalPortPresenter.this.getViewState().w();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CharSequence f37692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PortForwardingDynamicRuleLocalPortPresenter f37693c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CharSequence charSequence, PortForwardingDynamicRuleLocalPortPresenter portForwardingDynamicRuleLocalPortPresenter, zt.e eVar) {
            super(2, eVar);
            this.f37692b = charSequence;
            this.f37693c = portForwardingDynamicRuleLocalPortPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new d(this.f37692b, this.f37693c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37691a;
            if (i10 == 0) {
                x.b(obj);
                CharSequence charSequence = this.f37692b;
                if (charSequence != null) {
                    zi.b bVar = this.f37693c.f37682b;
                    this.f37691a = 1;
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
        int f37694a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDynamicRuleLocalPortPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37694a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDynamicRuleLocalPortPresenter.this.getViewState().y(true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37696a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDynamicRuleLocalPortPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37696a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDynamicRuleLocalPortPresenter.this.getViewState().y(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37698a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return PortForwardingDynamicRuleLocalPortPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37698a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            PortForwardingDynamicRuleLocalPortPresenter.this.getViewState().v();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public PortForwardingDynamicRuleLocalPortPresenter(PortForwardingWizardData portForwardingWizardData) {
        t.f(portForwardingWizardData, "wizardData");
        this.f37681a = portForwardingWizardData;
        this.f37682b = new zi.b(this);
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

    public final void s2(CharSequence charSequence, CharSequence charSequence2) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(charSequence, charSequence2, this, null), 3, null);
    }

    public final void t2(CharSequence charSequence) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(charSequence, this, null), 3, null);
    }
}

package com.server.auditor.ssh.client.presenters.account;

import com.server.auditor.ssh.client.interactors.c1;
import com.server.auditor.ssh.client.models.a0;
import com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.presenters.account.EnterpriseSingleSignOnEnterEmailPresenter;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import hg.b2;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import qi.b;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class EnterpriseSingleSignOnEnterEmailPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.account.l> implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f36391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f36394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f36395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f36396f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final c1 f36397u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final qi.b f36398v;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36399a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36399a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36401a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36401a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            a0 a0VarA = EnterpriseSingleSignOnEnterEmailPresenter.this.f36397u.a(EnterpriseSingleSignOnEnterEmailPresenter.this.f36395e);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().C(a0VarA.a());
            if (a0VarA.b()) {
                EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().l();
                EnterpriseSingleSignOnEnterEmailPresenter.this.H2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36403a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36405c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f36405c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new c(this.f36405c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36403a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.f36395e = su.s.n1(this.f36405c).toString();
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().C(null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36406a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36408c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, zt.e eVar) {
            super(2, eVar);
            this.f36408c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new d(this.f36408c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36406a;
            if (i10 == 0) {
                x.b(obj);
                qi.b bVar = EnterpriseSingleSignOnEnterEmailPresenter.this.f36398v;
                String str = this.f36408c;
                this.f36406a = 1;
                if (bVar.b(str, this) == objF) {
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
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36409a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f36411c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Integer num, zt.e eVar) {
            super(2, eVar);
            this.f36411c = num;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new e(this.f36411c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36409a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().e();
            Integer num = this.f36411c;
            if (num != null) {
                y9.a.f86838a.g("SAML SSO failed with " + num);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36412a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36414c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f36414c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new f(this.f36414c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36412a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().e();
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().k(this.f36414c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36415a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36417c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f36417c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new g(this.f36417c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36415a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().e();
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().k(this.f36417c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36418a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36418a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().e0(EnterpriseSingleSignOnEnterEmailPresenter.this.f36392b);
            if (EnterpriseSingleSignOnEnterEmailPresenter.this.f36392b != null) {
                EnterpriseSingleSignOnEnterEmailPresenter.this.D2();
            }
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().z(EnterpriseSingleSignOnEnterEmailPresenter.this.f36391a);
            EnterpriseSingleSignOnEnterEmailPresenter.this.f36396f.e2(Avo.AuthMethod.WORKOS_SSO);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36420a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36422c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, zt.e eVar) {
            super(2, eVar);
            this.f36422c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new i(this.f36422c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36420a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.f36396f.g6(this.f36422c);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().e();
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().k(this.f36422c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36423a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36423a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().e();
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36425a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36425a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().e();
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36427a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36429c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, zt.e eVar) {
            super(2, eVar);
            this.f36429c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new l(this.f36429c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36427a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().a2(this.f36429c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36430a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36432c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, zt.e eVar) {
            super(2, eVar);
            this.f36432c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new m(this.f36432c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36430a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().e();
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().z8(EnterpriseSingleSignOnEnterEmailPresenter.this.f36391a, new EnterpriseSingleSignOnAuthentication(EnterpriseSingleSignOnEnterEmailPresenter.this.f36395e, this.f36432c), EnterpriseSingleSignOnEnterEmailPresenter.this.f36394d, EnterpriseSingleSignOnEnterEmailPresenter.this.f36393c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36433a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36433a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().e();
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().s2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36435a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36435a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().e();
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().I1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36437a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f36439c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i10, zt.e eVar) {
            super(2, eVar);
            this.f36439c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new p(this.f36439c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36437a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().e();
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().m(this.f36439c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36440a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36440a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().e();
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36442a;

        r(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new r(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f36442a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().e();
            EnterpriseSingleSignOnEnterEmailPresenter.this.getViewState().h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36444a;

        s(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return EnterpriseSingleSignOnEnterEmailPresenter.this.new s(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f36444a;
            if (i10 == 0) {
                x.b(obj);
                qi.b bVar = EnterpriseSingleSignOnEnterEmailPresenter.this.f36398v;
                String str = EnterpriseSingleSignOnEnterEmailPresenter.this.f36395e;
                this.f36444a = 1;
                if (bVar.a(str, this) == objF) {
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
            return ((s) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public EnterpriseSingleSignOnEnterEmailPresenter(int i10, String str, boolean z10, boolean z11) {
        this.f36391a = i10;
        this.f36392b = str;
        this.f36393c = z10;
        this.f36394d = z11;
        this.f36395e = str == null ? "" : str;
        this.f36396f = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.f36397u = new c1();
        b2 b2Var = b2.f52944a;
        this.f36398v = new qi.b(new com.server.auditor.ssh.client.repositories.auth.k(b2Var.O1(), b2Var.B1()), new com.server.auditor.ssh.client.repositories.auth.l(b2Var.O1(), b2Var.B1()), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H2() {
        tp.d.a(new iu.l() { // from class: al.a
            @Override // iu.l
            public final Object invoke(Object obj) {
                return EnterpriseSingleSignOnEnterEmailPresenter.I2(this.f3290a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 I2(EnterpriseSingleSignOnEnterEmailPresenter enterpriseSingleSignOnEnterEmailPresenter, boolean z10) {
        if (z10) {
            enterpriseSingleSignOnEnterEmailPresenter.getViewState().d();
            wu.k.d(PresenterScopeKt.getPresenterScope(enterpriseSingleSignOnEnterEmailPresenter), null, null, enterpriseSingleSignOnEnterEmailPresenter.new s(null), 3, null);
        } else {
            enterpriseSingleSignOnEnterEmailPresenter.getViewState().g();
        }
        return m0.f82633a;
    }

    @Override // qi.b.a
    public void A0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: B2, reason: merged with bridge method [inline-methods] */
    public void attachView(com.server.auditor.ssh.client.contracts.account.l lVar) {
        super.attachView(lVar);
        getViewState().i();
    }

    public final void C2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void D2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void E2(String str) {
        t.f(str, "rawEmail");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(str, null), 3, null);
    }

    public final void F2(String str) {
        t.f(str, "oneToken");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(str, null), 3, null);
    }

    public final void G2(Integer num) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(num, null), 3, null);
    }

    @Override // qi.b.a
    public void N1(String str) {
        t.f(str, "url");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(str, null), 3, null);
    }

    @Override // qi.b.a
    public void O() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o(null), 3, null);
    }

    @Override // qi.b.a
    public void X1(String str) {
        t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(str, null), 3, null);
    }

    @Override // qi.b.a
    public void a0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(null), 3, null);
    }

    @Override // qi.b.a
    public void b2(String str) {
        t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(str, null), 3, null);
    }

    @Override // qi.b.a
    public void c2(String str) {
        t.f(str, "token");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(str, null), 3, null);
    }

    @Override // qi.b.a
    public void f1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new q(null), 3, null);
    }

    @Override // qi.b.a
    public void f2(String str) {
        t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(str, null), 3, null);
    }

    @Override // qi.b.a
    public void k1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    @Override // qi.b.a
    public void o0(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p(i10, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    @Override // qi.b.a
    public void y0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new r(null), 3, null);
    }
}

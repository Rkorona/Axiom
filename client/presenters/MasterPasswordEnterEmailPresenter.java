package com.server.auditor.ssh.client.presenters;

import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.o1;
import com.server.auditor.ssh.client.help.a0;
import com.server.auditor.ssh.client.interactors.c1;
import com.server.auditor.ssh.client.models.account.EmailAuthentication;
import com.server.auditor.ssh.client.models.account.EnterpriseSingleSignOnAuthentication;
import com.server.auditor.ssh.client.models.account.SecurityToken;
import com.server.auditor.ssh.client.presenters.MasterPasswordEnterEmailPresenter;
import hg.b2;
import ij.a;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import qi.b;
import ut.m0;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class MasterPasswordEnterEmailPresenter extends MvpPresenter<o1> implements b.a, a.InterfaceC0828a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c1 f35668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.server.auditor.ssh.client.app.a f35669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f35670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ij.a f35671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qi.b f35672f;

    static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35673a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35675c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, zt.e eVar) {
            super(2, eVar);
            this.f35675c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new a(this.f35675c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35673a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().C(new a0.b(this.f35675c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35676a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35676a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.I2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35678a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35678a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().C(new a0.a(R.string.toast_internet_available, new Object[0]));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35680a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35680a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().D();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35682a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f35684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f35685d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, String str, zt.e eVar) {
            super(2, eVar);
            this.f35684c = z10;
            this.f35685d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new e(this.f35684c, this.f35685d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35682a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            if (this.f35684c) {
                MasterPasswordEnterEmailPresenter.this.getViewState().C(new a0.a(R.string.email_is_not_registered, new Object[0]));
            } else {
                MasterPasswordEnterEmailPresenter.this.getViewState().I4(new EmailAuthentication(this.f35685d, (String) null, (SecurityToken) null, (String) null, 14, (ju.k) null));
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
        int f35686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f35687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MasterPasswordEnterEmailPresenter f35688c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, MasterPasswordEnterEmailPresenter masterPasswordEnterEmailPresenter, zt.e eVar) {
            super(2, eVar);
            this.f35687b = z10;
            this.f35688c = masterPasswordEnterEmailPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new f(this.f35687b, this.f35688c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35686a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (this.f35687b) {
                this.f35688c.getViewState().j2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35689a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35689a;
            if (i10 == 0) {
                ut.x.b(obj);
                com.server.auditor.ssh.client.models.a0 a0VarA = MasterPasswordEnterEmailPresenter.this.f35668b.a(MasterPasswordEnterEmailPresenter.this.f35667a);
                MasterPasswordEnterEmailPresenter.this.getViewState().Z(a0VarA.a());
                if (a0VarA.b()) {
                    MasterPasswordEnterEmailPresenter.this.getViewState().d();
                    ij.a aVar = MasterPasswordEnterEmailPresenter.this.f35671e;
                    String str = MasterPasswordEnterEmailPresenter.this.f35667a;
                    this.f35689a = 1;
                    if (ij.a.b(aVar, str, null, this, 2, null) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MasterPasswordEnterEmailPresenter f35693c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, MasterPasswordEnterEmailPresenter masterPasswordEnterEmailPresenter, zt.e eVar) {
            super(2, eVar);
            this.f35692b = str;
            this.f35693c = masterPasswordEnterEmailPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new h(this.f35692b, this.f35693c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35691a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            if (!ju.t.b(this.f35692b, this.f35693c.f35667a)) {
                this.f35693c.f35667a = su.s.n1(this.f35692b).toString();
                this.f35693c.getViewState().P(!su.s.m0(this.f35693c.f35667a));
                this.f35693c.getViewState().C(null);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35694a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35696c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, zt.e eVar) {
            super(2, eVar);
            this.f35696c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new i(this.f35696c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35694a;
            if (i10 == 0) {
                ut.x.b(obj);
                qi.b bVar = MasterPasswordEnterEmailPresenter.this.f35672f;
                String str = this.f35696c;
                this.f35694a = 1;
                if (bVar.b(str, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35697a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Integer f35699c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Integer num, zt.e eVar) {
            super(2, eVar);
            this.f35699c = num;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new j(this.f35699c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35697a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            Integer num = this.f35699c;
            if (num != null) {
                y9.a.f86838a.g("SAML SSO failed with " + num);
            }
            MasterPasswordEnterEmailPresenter.this.getViewState().h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35700a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35702c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, zt.e eVar) {
            super(2, eVar);
            this.f35702c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new k(this.f35702c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35700a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().k(this.f35702c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35703a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35705c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, zt.e eVar) {
            super(2, eVar);
            this.f35705c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new l(this.f35705c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35703a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().k(this.f35705c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35706a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35708c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, zt.e eVar) {
            super(2, eVar);
            this.f35708c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new m(this.f35708c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35706a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.f35670d.g6(this.f35708c);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().k(this.f35708c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class n extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35709a;

        n(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new n(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35709a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().q();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((n) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class o extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35711a;

        o(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new o(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35711a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((o) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class p extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35713a;

        p(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new p(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35713a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((p) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class q extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35715a;

        q(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new q(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35715a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().l();
            MasterPasswordEnterEmailPresenter.this.getViewState().F();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((q) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class r extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35717a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35719c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, zt.e eVar) {
            super(2, eVar);
            this.f35719c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new r(this.f35719c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35717a;
            if (i10 == 0) {
                ut.x.b(obj);
                MasterPasswordEnterEmailPresenter.this.getViewState().d();
                ij.a aVar = MasterPasswordEnterEmailPresenter.this.f35671e;
                String str = MasterPasswordEnterEmailPresenter.this.f35667a;
                String str2 = this.f35719c;
                this.f35717a = 1;
                if (aVar.a(str, str2, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((r) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class s extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35720a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35722c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str, zt.e eVar) {
            super(2, eVar);
            this.f35722c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new s(this.f35722c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35720a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().a2(this.f35722c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((s) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class t extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35723a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35725c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(String str, zt.e eVar) {
            super(2, eVar);
            this.f35725c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new t(this.f35725c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35723a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().I4(new EnterpriseSingleSignOnAuthentication(MasterPasswordEnterEmailPresenter.this.f35667a, this.f35725c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((t) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class u extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35726a;

        u(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new u(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35726a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().s2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((u) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class v extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35728a;

        v(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new v(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35728a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().I1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((v) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class w extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35730a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35732c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(int i10, zt.e eVar) {
            super(2, eVar);
            this.f35732c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new w(this.f35732c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35730a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().m(this.f35732c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((w) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class x extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35733a;

        x(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new x(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35733a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((x) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class y extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35735a;

        y(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new y(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35735a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MasterPasswordEnterEmailPresenter.this.getViewState().e();
            MasterPasswordEnterEmailPresenter.this.getViewState().h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((y) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class z extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35737a;

        z(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return MasterPasswordEnterEmailPresenter.this.new z(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35737a;
            if (i10 == 0) {
                ut.x.b(obj);
                qi.b bVar = MasterPasswordEnterEmailPresenter.this.f35672f;
                String str = MasterPasswordEnterEmailPresenter.this.f35667a;
                this.f35737a = 1;
                if (bVar.a(str, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((z) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public MasterPasswordEnterEmailPresenter(String str) {
        ju.t.f(str, "email");
        this.f35667a = str;
        this.f35668b = new c1();
        this.f35669c = com.server.auditor.ssh.client.app.a.N();
        this.f35670d = com.server.auditor.ssh.client.utils.analytics.a.y();
        b2 b2Var = b2.f52944a;
        this.f35671e = new ij.a(new sl.b(b2Var.P1(), b2Var.B1()), new com.server.auditor.ssh.client.repositories.auth.b(b2Var.P1(), b2Var.B1()), this);
        this.f35672f = new qi.b(new com.server.auditor.ssh.client.repositories.auth.k(b2Var.O1(), b2Var.B1()), new com.server.auditor.ssh.client.repositories.auth.l(b2Var.O1(), b2Var.B1()), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2() {
        this.f35670d.h2();
        tp.d.a(new iu.l() { // from class: zk.b
            @Override // iu.l
            public final Object invoke(Object obj) {
                return MasterPasswordEnterEmailPresenter.J2(this.f88018a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 J2(MasterPasswordEnterEmailPresenter masterPasswordEnterEmailPresenter, boolean z10) {
        if (z10) {
            masterPasswordEnterEmailPresenter.getViewState().d();
            wu.k.d(PresenterScopeKt.getPresenterScope(masterPasswordEnterEmailPresenter), null, null, masterPasswordEnterEmailPresenter.new z(null), 3, null);
        } else {
            masterPasswordEnterEmailPresenter.getViewState().g();
        }
        return m0.f82633a;
    }

    private final void K2() {
        if (this.f35669c.o0()) {
            this.f35670d.L2();
        } else {
            this.f35670d.M2();
        }
    }

    @Override // qi.b.a
    public void A0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new o(null), 3, null);
    }

    public final void A2(boolean z10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(z10, this, null), 3, null);
    }

    public final void B2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    public final void C2(String str) {
        ju.t.f(str, "rawEmail");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(str, this, null), 3, null);
    }

    public final void D2(String str) {
        ju.t.f(str, "oneToken");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(str, null), 3, null);
    }

    public final void E2(Integer num) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(num, null), 3, null);
    }

    @Override // ij.a.InterfaceC0828a
    public void F1(String str) {
        ju.t.f(str, "email");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void F2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new n(null), 3, null);
    }

    public final void G2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new q(null), 3, null);
    }

    public final void H2(String str) {
        ju.t.f(str, "responseToken");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new r(str, null), 3, null);
    }

    @Override // ij.a.InterfaceC0828a
    public void M1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    @Override // qi.b.a
    public void N1(String str) {
        ju.t.f(str, "url");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new s(str, null), 3, null);
    }

    @Override // qi.b.a
    public void O() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new v(null), 3, null);
    }

    @Override // ij.a.InterfaceC0828a
    public void P0(boolean z10, String str) {
        ju.t.f(str, "email");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(z10, str, null), 3, null);
    }

    @Override // qi.b.a
    public void X1(String str) {
        ju.t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(str, null), 3, null);
    }

    @Override // qi.b.a
    public void a0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new u(null), 3, null);
    }

    @Override // qi.b.a
    public void b2(String str) {
        ju.t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(str, null), 3, null);
    }

    @Override // qi.b.a
    public void c2(String str) {
        ju.t.f(str, "token");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new t(str, null), 3, null);
    }

    @Override // qi.b.a
    public void f1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new x(null), 3, null);
    }

    @Override // qi.b.a
    public void f2(String str) {
        ju.t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(str, null), 3, null);
    }

    @Override // ij.a.InterfaceC0828a
    public void h1(String str) {
        ju.t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    @Override // qi.b.a
    public void k1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new p(null), 3, null);
    }

    @Override // ij.a.InterfaceC0828a
    public void n2(String str) {
        ju.t.f(str, "error");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(str, null), 3, null);
    }

    @Override // qi.b.a
    public void o0(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new w(i10, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        this.f35669c.v(true);
        K2();
    }

    @Override // qi.b.a
    public void y0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new y(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: y2, reason: merged with bridge method [inline-methods] */
    public void attachView(o1 o1Var) {
        super.attachView(o1Var);
        getViewState().Bc(this.f35667a);
    }

    public final void z2() {
    }
}

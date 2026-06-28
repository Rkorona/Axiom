package com.server.auditor.ssh.client.presenters;

import android.text.Editable;
import com.crystalnix.termius.libtermius.wrappers.NewConnectionFlowActivity;
import com.server.auditor.ssh.client.contracts.z2;
import com.server.auditor.ssh.client.help.a0;
import com.server.auditor.ssh.client.interactors.d1;
import com.server.auditor.ssh.client.presenters.RequireTwoFactorAuthPasswordPresenter;
import com.server.auditor.ssh.client.repositories.auth.n;
import hg.b2;
import iu.p;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jg.e;
import jg.r;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import og.u;
import su.s;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class RequireTwoFactorAuthPasswordPresenter extends MvpPresenter<z2> implements r.a, e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f35820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f35821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f35822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d1 f35823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r f35824f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final jg.e f35825u;

    static final class a extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35826a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35826a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().j();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35828a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35830c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, zt.e eVar) {
            super(2, eVar);
            this.f35830c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordPresenter.this.new b(this.f35830c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35828a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().b2();
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().W5(new a0.b(this.f35830c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35831a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35833c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, zt.e eVar) {
            super(2, eVar);
            this.f35833c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordPresenter.this.new c(this.f35833c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35831a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().b2();
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().W5(new a0.b(this.f35833c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35834a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35834a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().b2();
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35836a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35836a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().b2();
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().vd();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35838a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35840c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f35840c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordPresenter.this.new f(this.f35840c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35838a;
            if (i10 == 0) {
                x.b(obj);
                if (t.b(RequireTwoFactorAuthPasswordPresenter.this.f35819a, "actionTwoFactorDisable")) {
                    RequireTwoFactorAuthPasswordPresenter.this.getViewState().b2();
                    RequireTwoFactorAuthPasswordPresenter.this.getViewState().P7(this.f35840c);
                    RequireTwoFactorAuthPasswordPresenter.this.getViewState().M();
                    RequireTwoFactorAuthPasswordPresenter.this.B2();
                } else {
                    long j10 = RequireTwoFactorAuthPasswordPresenter.this.f35820b;
                    if (j10 == 0) {
                        RequireTwoFactorAuthPasswordPresenter.this.getViewState().L0();
                        r rVar = RequireTwoFactorAuthPasswordPresenter.this.f35824f;
                        String str = this.f35840c;
                        this.f35838a = 1;
                        if (rVar.b(str, this) == objF) {
                            return objF;
                        }
                    } else if (j10 == 1) {
                        RequireTwoFactorAuthPasswordPresenter.this.getViewState().b2();
                        RequireTwoFactorAuthPasswordPresenter.this.getViewState().ub(this.f35840c);
                        RequireTwoFactorAuthPasswordPresenter.this.getViewState().M();
                        RequireTwoFactorAuthPasswordPresenter.this.B2();
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

    static final class g extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35841a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35841a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().b2();
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35843a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35843a;
            if (i10 == 0) {
                x.b(obj);
                if (!RequireTwoFactorAuthPasswordPresenter.E2(RequireTwoFactorAuthPasswordPresenter.this, false, 1, null)) {
                    return m0.f82633a;
                }
                RequireTwoFactorAuthPasswordPresenter.this.getViewState().L0();
                jg.e eVar = RequireTwoFactorAuthPasswordPresenter.this.f35825u;
                byte[] bArr = RequireTwoFactorAuthPasswordPresenter.this.f35821c;
                this.f35843a = 1;
                if (eVar.c(bArr, this) == objF) {
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
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35845a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Editable f35847c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Editable editable, zt.e eVar) {
            super(2, eVar);
            this.f35847c = editable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordPresenter.this.new i(this.f35847c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35845a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().W5(null);
            RequireTwoFactorAuthPasswordPresenter requireTwoFactorAuthPasswordPresenter = RequireTwoFactorAuthPasswordPresenter.this;
            requireTwoFactorAuthPasswordPresenter.f35821c = requireTwoFactorAuthPasswordPresenter.C2(this.f35847c);
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().t(RequireTwoFactorAuthPasswordPresenter.E2(RequireTwoFactorAuthPasswordPresenter.this, false, 1, null));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35848a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35850c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, zt.e eVar) {
            super(2, eVar);
            this.f35850c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordPresenter.this.new j(this.f35850c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35848a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().b2();
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().W5(new a0.b(this.f35850c));
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35851a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordPresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35851a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().b2();
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35853a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35855c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f35856d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f35857e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f35858f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, String str2, String str3, String str4, zt.e eVar) {
            super(2, eVar);
            this.f35855c = str;
            this.f35856d = str2;
            this.f35857e = str3;
            this.f35858f = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordPresenter.this.new l(this.f35855c, this.f35856d, this.f35857e, this.f35858f, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35853a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().b2();
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().F5(this.f35855c, this.f35856d, this.f35857e, this.f35858f);
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().M();
            RequireTwoFactorAuthPasswordPresenter.this.B2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35859a;

        m(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return RequireTwoFactorAuthPasswordPresenter.this.new m(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35859a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().b2();
            RequireTwoFactorAuthPasswordPresenter.this.getViewState().h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public RequireTwoFactorAuthPasswordPresenter(String str, long j10) {
        t.f(str, "action");
        this.f35819a = str;
        this.f35820b = j10;
        this.f35821c = new byte[0];
        this.f35822d = com.server.auditor.ssh.client.utils.analytics.a.y();
        this.f35823e = new d1();
        b2 b2Var = b2.f52944a;
        this.f35824f = new r(new ql.a(b2Var.O1(), b2Var.B1()), this);
        this.f35825u = new jg.e(new n(b2Var.O1(), b2Var.B1()), new qi.g(new lg.b(), new u()), new iu.a() { // from class: zk.c
            @Override // iu.a
            public final Object a() {
                return Boolean.valueOf(RequireTwoFactorAuthPasswordPresenter.A2());
            }
        }, b2Var.O0(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A2() {
        return com.server.auditor.ssh.client.app.a.N().p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B2() {
        Arrays.fill(this.f35821c, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] C2(Editable editable) {
        if (editable == null || s.m0(editable)) {
            return new byte[0];
        }
        char[] cArr = new char[editable.length()];
        editable.getChars(0, editable.length(), cArr, 0);
        byte[] bArrE = rg.l.e(cArr);
        Arrays.fill(cArr, (char) 0);
        char[] cArrD = rg.l.d(bArrE);
        Arrays.fill(bArrE, (byte) 0);
        byte[] bArrE2 = rg.l.e(cArrD);
        Arrays.fill(cArrD, (char) 0);
        t.c(bArrE2);
        return bArrE2;
    }

    private final boolean D2(boolean z10) {
        com.server.auditor.ssh.client.models.a0 a0VarA = this.f35823e.a(this.f35821c);
        if (z10) {
            getViewState().W5(a0VarA.a());
        }
        List listE = v.e(a0VarA);
        boolean z11 = false;
        if (listE == null || !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((com.server.auditor.ssh.client.models.a0) it.next()).b()) {
                    z11 = true;
                    break;
                }
            }
        }
        return !z11;
    }

    static /* synthetic */ boolean E2(RequireTwoFactorAuthPasswordPresenter requireTwoFactorAuthPasswordPresenter, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return requireTwoFactorAuthPasswordPresenter.D2(z10);
    }

    public final void F2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    public final void G2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    public final void H2(Editable editable) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(editable, null), 3, null);
    }

    @Override // jg.e.a
    public void I1(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(str, null), 3, null);
    }

    @Override // jg.r.a
    public void N0(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(str, null), 3, null);
    }

    @Override // jg.e.a
    public void Y(String str) {
        t.f(str, NewConnectionFlowActivity.EXTRA_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(str, null), 3, null);
    }

    @Override // jg.r.a
    public void d0(String str, String str2, String str3, String str4) {
        t.f(str, "token");
        t.f(str2, "providerCode");
        t.f(str3, "issuer");
        t.f(str4, "email");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(str, str2, str3, str4, null), 3, null);
    }

    @Override // jg.e.a
    public void d1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    @Override // jg.r.a
    public void k0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
        this.f35822d.R2();
    }

    @Override // jg.e.a
    public void s(String str) {
        t.f(str, "token");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(str, null), 3, null);
    }

    @Override // jg.e.a
    public void s0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // jg.r.a
    public void w0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    @Override // jg.e.a
    public void w1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: z2, reason: merged with bridge method [inline-methods] */
    public void attachView(z2 z2Var) {
        super.attachView(z2Var);
        getViewState().i();
    }
}

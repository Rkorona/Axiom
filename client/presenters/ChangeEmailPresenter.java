package com.server.auditor.ssh.client.presenters;

import android.text.Editable;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.server.auditor.ssh.client.contracts.b0;
import com.server.auditor.ssh.client.help.a0;
import com.server.auditor.ssh.client.interactors.c1;
import com.server.auditor.ssh.client.interactors.d1;
import com.server.auditor.ssh.client.repositories.auth.n;
import hg.b2;
import iu.p;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jg.c;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import og.u;
import rg.l;
import su.s;
import ut.m0;
import ut.x;
import vt.v;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class ChangeEmailPresenter extends MvpPresenter<b0> implements c.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f35287f = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f35288u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35289a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f35290b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c1 f35291c = new c1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d1 f35292d = new d1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jg.c f35293e;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35294a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35294a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangeEmailPresenter.this.getViewState().j();
            ChangeEmailPresenter.this.getViewState().M();
            ChangeEmailPresenter.this.z2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35296a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f35299d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f35298c = str;
            this.f35299d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailPresenter.this.new c(this.f35298c, this.f35299d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35296a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangeEmailPresenter.this.getViewState().e();
            if (this.f35298c.length() > 0) {
                ChangeEmailPresenter.this.getViewState().C3(new a0.b(this.f35298c));
            } else if (this.f35299d.length() > 0) {
                ChangeEmailPresenter.this.getViewState().zc(new a0.b(this.f35299d));
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35300a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35300a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangeEmailPresenter.this.getViewState().e();
            ChangeEmailPresenter.this.getViewState().n();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35302a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35302a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangeEmailPresenter.this.getViewState().e();
            ChangeEmailPresenter.this.getViewState().M1(ChangeEmailPresenter.this.f35289a, new String(ChangeEmailPresenter.this.f35290b, su.d.f78241b));
            ChangeEmailPresenter.this.z2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35304a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35304a;
            if (i10 == 0) {
                x.b(obj);
                if (!ChangeEmailPresenter.this.B2(true)) {
                    return m0.f82633a;
                }
                ChangeEmailPresenter.this.getViewState().d();
                jg.c cVar = ChangeEmailPresenter.this.f35293e;
                String str = ChangeEmailPresenter.this.f35289a;
                byte[] bArr = ChangeEmailPresenter.this.f35290b;
                this.f35304a = 1;
                if (jg.c.f(cVar, str, bArr, null, this, 4, null) == objF) {
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
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35306a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35308c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f35308c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailPresenter.this.new g(this.f35308c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35306a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangeEmailPresenter.this.f35289a = this.f35308c;
            ChangeEmailPresenter.this.getViewState().C3(null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35309a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35309a;
            if (i10 == 0) {
                x.b(obj);
                jg.c cVar = ChangeEmailPresenter.this.f35293e;
                this.f35309a = 1;
                if (cVar.h(this) == objF) {
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

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35311a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35313c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, zt.e eVar) {
            super(2, eVar);
            this.f35313c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailPresenter.this.new i(this.f35313c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35311a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangeEmailPresenter.this.f35289a = this.f35313c;
            ChangeEmailPresenter.this.G2();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35314a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Editable f35316c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Editable editable, zt.e eVar) {
            super(2, eVar);
            this.f35316c = editable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailPresenter.this.new j(this.f35316c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35314a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangeEmailPresenter changeEmailPresenter = ChangeEmailPresenter.this;
            changeEmailPresenter.f35290b = changeEmailPresenter.A2(this.f35316c);
            ChangeEmailPresenter.this.getViewState().zc(null);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ChangeEmailPresenter() {
        b2 b2Var = b2.f52944a;
        n nVar = new n(b2Var.O1(), b2Var.B1());
        qi.g gVar = new qi.g(new lg.b(), new u());
        sl.a aVar = new sl.a(b2Var.P1(), b2Var.B1());
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        t.e(aVarN, "getInstance(...)");
        ug.c cVarQ = com.server.auditor.ssh.client.app.a.N().Q();
        t.e(cVarQ, "getKeyValueStorage(...)");
        this.f35293e = new jg.c(nVar, gVar, aVar, aVarN, cVarQ, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] A2(Editable editable) {
        if (editable == null || s.m0(editable)) {
            return new byte[0];
        }
        char[] cArr = new char[editable.length()];
        editable.getChars(0, editable.length(), cArr, 0);
        byte[] bArrE = l.e(cArr);
        Arrays.fill(cArr, (char) 0);
        char[] cArrD = l.d(bArrE);
        Arrays.fill(bArrE, (byte) 0);
        byte[] bArrE2 = l.e(cArrD);
        Arrays.fill(cArrD, (char) 0);
        t.c(bArrE2);
        return bArrE2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B2(boolean z10) {
        com.server.auditor.ssh.client.models.a0 a0VarA = this.f35291c.a(this.f35289a);
        com.server.auditor.ssh.client.models.a0 a0VarA2 = this.f35292d.a(this.f35290b);
        if (z10) {
            getViewState().C3(a0VarA.a());
            getViewState().zc(a0VarA2.a());
        }
        List listR = v.r(a0VarA2, a0VarA);
        boolean z11 = false;
        if (listR == null || !listR.isEmpty()) {
            Iterator it = listR.iterator();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void G2() {
        getViewState().a();
        getViewState().Ud(this.f35289a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z2() {
        Arrays.fill(this.f35290b, (byte) 0);
    }

    public final void C2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void D2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void E2(String str) {
        t.f(str, "newEmail");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(str, null), 3, null);
    }

    public final void F2(Editable editable) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(editable, null), 3, null);
    }

    @Override // jg.c.a
    public void M(String str) {
        t.f(str, "email");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(str, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    @Override // jg.c.a
    public void q1(String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // jg.c.a
    public void t() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    @Override // jg.c.a
    public void u0(String str, String str2) {
        t.f(str, "emailErrorMessage");
        t.f(str2, "passwordErrorMessage");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(str, str2, null), 3, null);
    }
}

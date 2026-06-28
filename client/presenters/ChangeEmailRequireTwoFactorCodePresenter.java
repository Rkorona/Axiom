package com.server.auditor.ssh.client.presenters;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.server.auditor.ssh.client.contracts.d0;
import com.server.auditor.ssh.client.repositories.auth.n;
import hg.b2;
import iu.p;
import jg.c;
import ju.k;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import og.u;
import su.s;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes4.dex */
public final class ChangeEmailRequireTwoFactorCodePresenter extends MvpPresenter<d0> implements c.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f35317e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f35318f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f35320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f35321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jg.c f35322d;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35323a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailRequireTwoFactorCodePresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35323a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangeEmailRequireTwoFactorCodePresenter.this.getViewState().j();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35325a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f35328d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, zt.e eVar) {
            super(2, eVar);
            this.f35327c = str;
            this.f35328d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailRequireTwoFactorCodePresenter.this.new c(this.f35327c, this.f35328d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35325a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangeEmailRequireTwoFactorCodePresenter.this.getViewState().e();
            if (this.f35327c.length() > 0) {
                ChangeEmailRequireTwoFactorCodePresenter.this.getViewState().s(this.f35327c);
            } else if (this.f35328d.length() > 0) {
                ChangeEmailRequireTwoFactorCodePresenter.this.getViewState().s(this.f35328d);
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
        int f35329a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailRequireTwoFactorCodePresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35329a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangeEmailRequireTwoFactorCodePresenter.this.getViewState().e();
            ChangeEmailRequireTwoFactorCodePresenter.this.getViewState().n();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35331a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35333c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, zt.e eVar) {
            super(2, eVar);
            this.f35333c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailRequireTwoFactorCodePresenter.this.new e(this.f35333c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35331a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangeEmailRequireTwoFactorCodePresenter.this.getViewState().e();
            ChangeEmailRequireTwoFactorCodePresenter.this.getViewState().s(this.f35333c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35334a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailRequireTwoFactorCodePresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35334a;
            if (i10 == 0) {
                x.b(obj);
                ChangeEmailRequireTwoFactorCodePresenter.this.getViewState().d();
                jg.c cVar = ChangeEmailRequireTwoFactorCodePresenter.this.f35322d;
                String str = ChangeEmailRequireTwoFactorCodePresenter.this.f35319a;
                byte[] bArr = ChangeEmailRequireTwoFactorCodePresenter.this.f35320b;
                String str2 = ChangeEmailRequireTwoFactorCodePresenter.this.f35321c;
                this.f35334a = 1;
                if (cVar.e(str, bArr, str2, this) == objF) {
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
        int f35336a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35338c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f35338c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangeEmailRequireTwoFactorCodePresenter.this.new g(this.f35338c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35336a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangeEmailRequireTwoFactorCodePresenter.this.f35321c = this.f35338c;
            ChangeEmailRequireTwoFactorCodePresenter.this.getViewState().s(null);
            ChangeEmailRequireTwoFactorCodePresenter.this.getViewState().t(ChangeEmailRequireTwoFactorCodePresenter.this.x2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ChangeEmailRequireTwoFactorCodePresenter(String str, byte[] bArr) {
        t.f(str, "email");
        t.f(bArr, "encodedPassword");
        this.f35319a = str;
        this.f35320b = bArr;
        this.f35321c = "";
        b2 b2Var = b2.f52944a;
        n nVar = new n(b2Var.O1(), b2Var.B1());
        qi.g gVar = new qi.g(new lg.b(), new u());
        sl.a aVar = new sl.a(b2Var.P1(), b2Var.B1());
        com.server.auditor.ssh.client.app.a aVarN = com.server.auditor.ssh.client.app.a.N();
        t.e(aVarN, "getInstance(...)");
        ug.c cVarQ = com.server.auditor.ssh.client.app.a.N().Q();
        t.e(cVarQ, "getKeyValueStorage(...)");
        this.f35322d = new jg.c(nVar, gVar, aVar, aVarN, cVarQ, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x2() {
        return (this.f35321c.length() == 0 || s.m0(this.f35321c)) ? false : true;
    }

    public final void A2(String str) {
        t.f(str, "code");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(str, null), 3, null);
    }

    @Override // jg.c.a
    public void M(String str) {
        t.f(str, "email");
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
    }

    @Override // jg.c.a
    public void q1(String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(str, null), 3, null);
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

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: w2, reason: merged with bridge method [inline-methods] */
    public void attachView(d0 d0Var) {
        super.attachView(d0Var);
        getViewState().i();
    }

    public final void y2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    public final void z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }
}

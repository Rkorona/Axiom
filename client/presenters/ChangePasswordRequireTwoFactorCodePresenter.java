package com.server.auditor.ssh.client.presenters;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.server.auditor.ssh.client.contracts.i0;
import ig.d;
import iu.p;
import ju.t;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import su.s;
import ut.m0;
import ut.x;
import vl.b;

/* JADX INFO: loaded from: classes4.dex */
public final class ChangePasswordRequireTwoFactorCodePresenter extends MvpPresenter<i0> implements d.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f35390u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f35391v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f35392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f35393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ig.d f35394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f35396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vl.b f35397f;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35398a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCodePresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35398a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().j();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35400a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCodePresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35400a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().e();
            ChangePasswordRequireTwoFactorCodePresenter.this.f35395d = false;
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().t8();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35402a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCodePresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35402a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().e();
            ChangePasswordRequireTwoFactorCodePresenter.this.f35395d = false;
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().E1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35404a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCodePresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35404a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().e();
            ChangePasswordRequireTwoFactorCodePresenter.this.f35395d = false;
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().S1();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35406a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35408c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f35408c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCodePresenter.this.new f(this.f35408c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35406a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().e();
            ChangePasswordRequireTwoFactorCodePresenter.this.f35395d = false;
            if (this.f35408c.length() == 0) {
                ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().S1();
            } else {
                ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().k(this.f35408c);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35409a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCodePresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35409a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().e();
            ChangePasswordRequireTwoFactorCodePresenter.this.f35395d = false;
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35411a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35413c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, zt.e eVar) {
            super(2, eVar);
            this.f35413c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCodePresenter.this.new h(this.f35413c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35411a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().e();
            ChangePasswordRequireTwoFactorCodePresenter.this.f35395d = false;
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().s(this.f35413c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35414a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCodePresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35414a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().e();
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().n();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35416a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35418c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i10, zt.e eVar) {
            super(2, eVar);
            this.f35418c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCodePresenter.this.new j(this.f35418c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35416a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().e();
            ChangePasswordRequireTwoFactorCodePresenter.this.f35395d = false;
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().m(this.f35418c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35419a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCodePresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35419a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().e();
            ChangePasswordRequireTwoFactorCodePresenter.this.f35395d = false;
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().h();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35421a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCodePresenter.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35421a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (ChangePasswordRequireTwoFactorCodePresenter.this.f35396e.length() == 0) {
                ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().M6();
                ChangePasswordRequireTwoFactorCodePresenter.this.f35395d = false;
            } else {
                ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().d();
                ChangePasswordRequireTwoFactorCodePresenter.this.f35394c.O(ChangePasswordRequireTwoFactorCodePresenter.this.f35393b, ChangePasswordRequireTwoFactorCodePresenter.this.f35392a, ChangePasswordRequireTwoFactorCodePresenter.this.f35396e);
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35423a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35425c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, zt.e eVar) {
            super(2, eVar);
            this.f35425c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return ChangePasswordRequireTwoFactorCodePresenter.this.new m(this.f35425c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35423a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            ChangePasswordRequireTwoFactorCodePresenter.this.f35396e = this.f35425c;
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().s(null);
            ChangePasswordRequireTwoFactorCodePresenter.this.getViewState().t(ChangePasswordRequireTwoFactorCodePresenter.this.y2());
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((m) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public ChangePasswordRequireTwoFactorCodePresenter(byte[] bArr, byte[] bArr2) {
        t.f(bArr, "oldEncodedPassword");
        t.f(bArr2, "newEncodedPassword");
        this.f35392a = bArr;
        this.f35393b = bArr2;
        this.f35394c = new ig.d(this);
        this.f35396e = "";
        this.f35397f = b.a.b(vl.b.f83635b, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y2() {
        return (this.f35396e.length() == 0 || s.m0(this.f35396e)) ? false : true;
    }

    public final void A2() {
        if (this.f35395d) {
            return;
        }
        this.f35395d = true;
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(null), 3, null);
    }

    public final void B2(String str) {
        t.f(str, "code");
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new m(str, null), 3, null);
    }

    @Override // ig.d.a
    public void C() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    @Override // ig.d.a
    public void S0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    @Override // ig.d.a
    public void V1(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(i10, null), 3, null);
    }

    @Override // ig.d.a
    public void a1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }

    @Override // ig.d.a
    public void b1(String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(str, null), 3, null);
    }

    @Override // ig.d.a
    public void i1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    @Override // ig.d.a
    public void n1(String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(str, null), 3, null);
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        this.f35394c.f();
        super.onDestroy();
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().a();
    }

    @Override // ig.d.a
    public void v1(String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    @Override // ig.d.a
    public void x0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public void attachView(i0 i0Var) {
        super.attachView(i0Var);
        getViewState().i();
    }

    public final void z2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }
}

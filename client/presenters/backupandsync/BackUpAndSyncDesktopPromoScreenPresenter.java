package com.server.auditor.ssh.client.presenters.backupandsync;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.server.auditor.ssh.client.interactors.v0;
import com.server.auditor.ssh.client.widget.ProgressButton;
import hg.b2;
import il.l0;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.s0;

/* JADX INFO: loaded from: classes4.dex */
public final class BackUpAndSyncDesktopPromoScreenPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.b> implements v0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f37007c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f37008d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.server.auditor.ssh.client.utils.analytics.a f37009a = com.server.auditor.ssh.client.utils.analytics.a.y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0 f37010b = new v0(new l0(b2.f52944a.O1()), this);

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37011a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreenPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37011a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37013a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreenPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37013a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreenPresenter.this.f37009a.u0();
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().T0(ProgressButton.b.c.f46551a);
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().K0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37015a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreenPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37015a;
            if (i10 == 0) {
                x.b(obj);
                this.f37015a = 1;
                if (s0.b(500L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().T0(ProgressButton.b.a.f46549a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37017a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreenPresenter.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37017a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().T0(ProgressButton.b.C0663b.f46550a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37019a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37021c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, zt.e eVar) {
            super(2, eVar);
            this.f37021c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreenPresenter.this.new f(this.f37021c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37019a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().wd(ProgressButton.b.C0663b.f46550a);
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().showErrorMessage(this.f37021c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37022a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreenPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37022a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().wd(ProgressButton.b.C0663b.f46550a);
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().n0();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37024a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreenPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37024a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().wd(ProgressButton.b.a.f46549a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37026a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreenPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37026a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().wd(ProgressButton.b.a.f46549a);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37028a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreenPresenter.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37028a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().wd(ProgressButton.b.C0663b.f46550a);
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().s9();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37030a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreenPresenter.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f37030a;
            if (i10 == 0) {
                x.b(obj);
                BackUpAndSyncDesktopPromoScreenPresenter.this.f37009a.y0();
                BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().qa();
                BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().wd(ProgressButton.b.c.f46551a);
                v0 v0Var = BackUpAndSyncDesktopPromoScreenPresenter.this.f37010b;
                this.f37030a = 1;
                if (v0Var.b(this) == objF) {
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
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class l extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37032a;

        l(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDesktopPromoScreenPresenter.this.new l(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f37032a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDesktopPromoScreenPresenter.this.getViewState().b();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((l) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    @Override // com.server.auditor.ssh.client.interactors.v0.a
    public void C0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(null), 3, null);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        this.f37009a.v0();
        getViewState().a();
    }

    public final void s2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.v0.a
    public void t1(String str) {
        t.f(str, ErrorResponseData.JSON_ERROR_MESSAGE);
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(str, null), 3, null);
    }

    public final void t2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void u2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void v2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(null), 3, null);
    }

    public final void w2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    public final void x2() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new l(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.v0.a
    public void y1() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.v0.a
    public void z0() {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.v0.a
    public void z1(int i10) {
        wu.k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }
}

package com.server.auditor.ssh.client.presenters;

import android.hardware.usb.UsbDevice;
import com.server.auditor.ssh.client.interactors.x0;
import com.server.auditor.ssh.client.models.Host;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import il.o0;
import iu.p;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpPresenter;
import moxy.PresenterScopeKt;
import ut.m0;
import ut.x;
import wu.i0;
import wu.k;

/* JADX INFO: loaded from: classes4.dex */
public final class SerialConnectParametersPresenter extends MvpPresenter<com.server.auditor.ssh.client.contracts.views.h> implements x0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0 f35861a;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35862a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParametersPresenter.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35862a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SerialConnectParametersPresenter.this.getViewState().s6(true);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35864a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParametersPresenter.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35864a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SerialConnectParametersPresenter.this.getViewState().s6(false);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35866a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParametersPresenter.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35866a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SerialConnectParametersPresenter.this.f35861a.a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35868a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParametersPresenter.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35868a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SerialConnectParametersPresenter.this.f35861a.c();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35870a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ UsbDevice f35872c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Integer f35873d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Integer f35874e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Integer f35875f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Integer f35876u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Integer f35877v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(UsbDevice usbDevice, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, zt.e eVar) {
            super(2, eVar);
            this.f35872c = usbDevice;
            this.f35873d = num;
            this.f35874e = num2;
            this.f35875f = num3;
            this.f35876u = num4;
            this.f35877v = num5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParametersPresenter.this.new e(this.f35872c, this.f35873d, this.f35874e, this.f35875f, this.f35876u, this.f35877v, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35870a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SerialConnectParametersPresenter.this.f35861a.d(this.f35872c, this.f35873d, this.f35874e, this.f35875f, this.f35876u, this.f35877v);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35878a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParametersPresenter.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35878a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SerialConnectParametersPresenter.this.f35861a.a();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35880a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParametersPresenter.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35880a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SerialConnectParametersPresenter.this.f35861a.c();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35882a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParametersPresenter.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35882a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SerialConnectParametersPresenter.this.f35861a.g();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35884a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParametersPresenter.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35884a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SerialConnectParametersPresenter.this.getViewState().i7();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35886a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35888c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f35889d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35890e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f35891f;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f35892u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i10, int i11, int i12, int i13, int i14, zt.e eVar) {
            super(2, eVar);
            this.f35888c = i10;
            this.f35889d = i11;
            this.f35890e = i12;
            this.f35891f = i13;
            this.f35892u = i14;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return SerialConnectParametersPresenter.this.new j(this.f35888c, this.f35889d, this.f35890e, this.f35891f, this.f35892u, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35886a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            SerialConnectParametersPresenter.this.getViewState().cb(this.f35888c);
            SerialConnectParametersPresenter.this.getViewState().U2(this.f35889d);
            SerialConnectParametersPresenter.this.getViewState().Ea(this.f35890e);
            SerialConnectParametersPresenter.this.getViewState().K7(this.f35891f);
            SerialConnectParametersPresenter.this.getViewState().I9(this.f35892u);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public SerialConnectParametersPresenter() {
        hg.d dVarM = com.server.auditor.ssh.client.app.a.N().M();
        t.e(dVarM, "getInsensitiveKeyValueRepository(...)");
        com.server.auditor.ssh.client.utils.analytics.a aVarY = com.server.auditor.ssh.client.utils.analytics.a.y();
        t.e(aVarY, "getInstance(...)");
        this.f35861a = new x0(dVarM, new o0(aVarY), this);
    }

    @Override // com.server.auditor.ssh.client.interactors.x0.a
    public void A1() {
        getViewState().q3();
    }

    @Override // com.server.auditor.ssh.client.interactors.x0.a
    public void E1() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new b(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.x0.a
    public void Z0(int i10, int i11, int i12, int i13, int i14) {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new j(i10, i11, i12, i13, i14, null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.x0.a
    public void l1() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new a(null), 3, null);
    }

    @Override // com.server.auditor.ssh.client.interactors.x0.a
    public void m0(Host host) {
        t.f(host, "host");
        host.setConnectionOrigin(Avo.ConnectionOrigin.QUICK_CONNECT);
        getViewState().Ec(host);
    }

    @Override // moxy.MvpPresenter
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
        getViewState().c();
        this.f35861a.b();
    }

    public final void r2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new c(null), 3, null);
    }

    public final void s2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new d(null), 3, null);
    }

    public final void t2(UsbDevice usbDevice, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        t.f(usbDevice, "device");
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(usbDevice, num, num2, num3, num4, num5, null), 3, null);
    }

    public final void u2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new f(null), 3, null);
    }

    public final void v2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new g(null), 3, null);
    }

    public final void w2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(null), 3, null);
    }

    public final void x2() {
        k.d(PresenterScopeKt.getPresenterScope(this), null, null, new i(null), 3, null);
    }
}

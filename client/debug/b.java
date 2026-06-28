package com.server.auditor.ssh.client.debug;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.debug.b;
import com.server.auditor.ssh.client.widget.ConnectionProgressView;
import moxy.MvpBottomSheetDialogFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends MvpBottomSheetDialogFragment implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qg.v0 f23674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f23675b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f23672d = {ju.n0.g(new ju.g0(b.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/debug/ConnectionProgressPrototypePresenter;", 0))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f23671c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f23673e = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.server.auditor.ssh.client.debug.b$b, reason: collision with other inner class name */
    static final class C0379b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23676a;

        C0379b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return b.this.new C0379b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23676a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.this.zf().f74103i.E(R.drawable.ic_connection_fingerprint);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((C0379b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23678a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return b.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23678a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.this.zf().f74103i.E(R.drawable.ic_connection_identity);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23680a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return b.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23680a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.this.zf().f74103i.E(R.drawable.ic_connection_interactive);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23682a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return b.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23682a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.this.zf().f74103i.E(R.drawable.ic_connection_key);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23684a;

        f(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return b.this.new f(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23684a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.this.zf().f74103i.E(R.drawable.ic_connection_password);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23686a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return b.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23686a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.this.zf().f74103i.H();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23688a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(b bVar, View view) {
            bVar.Af().x2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void B(b bVar, View view) {
            bVar.Af().w2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(b bVar, View view) {
            bVar.Af().q2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(b bVar, View view) {
            bVar.Af().r2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(b bVar, View view) {
            bVar.Af().u2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(b bVar, View view) {
            bVar.Af().t2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(b bVar, View view) {
            bVar.Af().s2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(b bVar, View view) {
            bVar.Af().y2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(b bVar, View view) {
            bVar.Af().v2();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return b.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23688a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            MaterialButton materialButton = b.this.zf().f74097c;
            final b bVar = b.this;
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.debug.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.h.s(bVar, view);
                }
            });
            MaterialButton materialButton2 = b.this.zf().f74098d;
            final b bVar2 = b.this;
            materialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.debug.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.h.t(bVar2, view);
                }
            });
            MaterialButton materialButton3 = b.this.zf().f74101g;
            final b bVar3 = b.this;
            materialButton3.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.debug.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.h.u(bVar3, view);
                }
            });
            MaterialButton materialButton4 = b.this.zf().f74100f;
            final b bVar4 = b.this;
            materialButton4.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.debug.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.h.v(bVar4, view);
                }
            });
            MaterialButton materialButton5 = b.this.zf().f74099e;
            final b bVar5 = b.this;
            materialButton5.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.debug.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.h.x(bVar5, view);
                }
            });
            MaterialButton materialButton6 = b.this.zf().f74107m;
            final b bVar6 = b.this;
            materialButton6.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.debug.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.h.y(bVar6, view);
                }
            });
            MaterialButton materialButton7 = b.this.zf().f74104j;
            final b bVar7 = b.this;
            materialButton7.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.debug.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.h.z(bVar7, view);
                }
            });
            MaterialButton materialButton8 = b.this.zf().f74106l;
            final b bVar8 = b.this;
            materialButton8.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.debug.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.h.A(bVar8, view);
                }
            });
            MaterialButton materialButton9 = b.this.zf().f74105k;
            final b bVar9 = b.this;
            materialButton9.setOnClickListener(new View.OnClickListener() { // from class: com.server.auditor.ssh.client.debug.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.h.B(bVar9, view);
                }
            });
            b.this.zf().f74103i.setAnimationDuration(1500L);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23690a;

        i(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return b.this.new i(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23690a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.this.zf().f74103i.S();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23692a;

        j(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ut.m0 k(b bVar) {
            bVar.dismiss();
            return ut.m0.f82633a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return b.this.new j(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23692a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            ConnectionProgressView connectionProgressView = b.this.zf().f74103i;
            final b bVar = b.this;
            connectionProgressView.K(new iu.a() { // from class: com.server.auditor.ssh.client.debug.l
                @Override // iu.a
                public final Object a() {
                    return b.j.k(bVar);
                }
            });
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23694a;

        k(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return b.this.new k(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f23694a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            b.this.zf().f74103i.U();
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    public b() {
        iu.a aVar = new iu.a() { // from class: com.server.auditor.ssh.client.debug.a
            @Override // iu.a
            public final Object a() {
                return b.Bf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        ju.t.e(mvpDelegate, "mvpDelegate");
        this.f23675b = new MoxyKtxDelegate(mvpDelegate, ConnectionProgressPrototypePresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConnectionProgressPrototypePresenter Af() {
        return (ConnectionProgressPrototypePresenter) this.f23675b.getValue(this, f23672d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConnectionProgressPrototypePresenter Bf() {
        return new ConnectionProgressPrototypePresenter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qg.v0 zf() {
        qg.v0 v0Var = this.f23674a;
        if (v0Var != null) {
            return v0Var;
        }
        throw new IllegalStateException();
    }

    @Override // com.server.auditor.ssh.client.debug.n
    public void A() {
        bh.a.b(this, new k(null));
    }

    @Override // com.server.auditor.ssh.client.debug.n
    public void J7() {
        bh.a.b(this, new i(null));
    }

    @Override // com.server.auditor.ssh.client.debug.n
    public void Mc() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.debug.n
    public void Q3() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.debug.n
    public void Xa() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.debug.n
    public void Y8() {
        bh.a.b(this, new f(null));
    }

    @Override // com.server.auditor.ssh.client.debug.n
    public void c() {
        bh.a.b(this, new h(null));
    }

    @Override // com.server.auditor.ssh.client.debug.n
    /* JADX INFO: renamed from: if, reason: not valid java name */
    public void mo15if() {
        bh.a.b(this, new j(null));
    }

    @Override // com.server.auditor.ssh.client.debug.n
    public void lb() {
        bh.a.b(this, new C0379b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f23674a = qg.v0.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = zf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpBottomSheetDialogFragment, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f23674a = null;
        super.onDestroyView();
    }

    @Override // com.server.auditor.ssh.client.debug.n
    public void z4() {
        bh.a.b(this, new e(null));
    }
}

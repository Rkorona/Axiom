package com.server.auditor.ssh.client.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.navigation.notifications.newcrypto.NewCryptoActivity;
import com.server.auditor.ssh.client.navigation.ui.compose.g6;
import com.server.auditor.ssh.client.navigation.x1;
import com.server.auditor.ssh.client.navigation.z1;
import com.server.auditor.ssh.client.widget.ProgressButton;
import il.d;
import moxy.MvpAppCompatFragment;
import qg.y3;
import tp.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 extends MvpAppCompatFragment implements z1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private z1 f35094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.server.auditor.ssh.client.adapters.j f35095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private y3 f35096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final iu.p f35097d = new iu.p() { // from class: com.server.auditor.ssh.client.navigation.w1
        @Override // iu.p
        public final Object invoke(Object obj, Object obj2) {
            return x1.Df(this.f35090a, ((Integer) obj).intValue(), (Integer) obj2);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f35098e = new a();

    public static final class a extends RecyclerView.j {
        a() {
        }

        private final void h() {
            x1 x1Var = x1.this;
            com.server.auditor.ssh.client.adapters.j jVar = x1Var.f35095b;
            if (jVar == null) {
                ju.t.t("adapter");
                jVar = null;
            }
            x1Var.Ef(jVar.i() == 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            super.a();
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            super.d(i10, i11);
            h();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            super.f(i10, i11);
            h();
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35100a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35102c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, zt.e eVar) {
            super(2, eVar);
            this.f35102c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return x1.this.new b(this.f35102c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35100a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            com.server.auditor.ssh.client.adapters.j jVar = x1.this.f35095b;
            if (jVar == null) {
                ju.t.t("adapter");
                jVar = null;
            }
            jVar.T(this.f35102c, null);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35103a;

        static final class a extends kotlin.coroutines.jvm.internal.m implements iu.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f35105a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x1 f35106b;

            /* JADX INFO: renamed from: com.server.auditor.ssh.client.navigation.x1$c$a$a, reason: collision with other inner class name */
            static final class C0570a implements zu.g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ x1 f35107a;

                C0570a(x1 x1Var) {
                    this.f35107a = x1Var;
                }

                @Override // zu.g
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(d.a aVar, zt.e eVar) {
                    if (aVar instanceof d.a.b) {
                        this.f35107a.zf().f74444d.setRefreshing(false);
                        com.server.auditor.ssh.client.adapters.j jVar = this.f35107a.f35095b;
                        if (jVar == null) {
                            ju.t.t("adapter");
                            jVar = null;
                        }
                        jVar.R(((d.a.b) aVar).a());
                    }
                    return ut.m0.f82633a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(x1 x1Var, zt.e eVar) {
                super(2, eVar);
                this.f35106b = x1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zt.e create(Object obj, zt.e eVar) {
                return new a(this.f35106b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = au.b.f();
                int i10 = this.f35105a;
                if (i10 == 0) {
                    ut.x.b(obj);
                    z1 z1Var = this.f35106b.f35094a;
                    if (z1Var == null) {
                        ju.t.t("presenter");
                        z1Var = null;
                    }
                    zu.k0 notifications = z1Var.getNotifications();
                    C0570a c0570a = new C0570a(this.f35106b);
                    this.f35105a = 1;
                    if (notifications.collect(c0570a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ut.x.b(obj);
                }
                throw new ut.j();
            }

            @Override // iu.p
            public final Object invoke(wu.i0 i0Var, zt.e eVar) {
                return ((a) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
            }
        }

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return x1.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f35103a;
            if (i10 == 0) {
                ut.x.b(obj);
                androidx.lifecycle.q lifecycle = x1.this.getViewLifecycleOwner().getLifecycle();
                q.b bVar = q.b.f8799d;
                a aVar = new a(x1.this, null);
                this.f35103a = 1;
                if (androidx.lifecycle.r0.a(lifecycle, bVar, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ut.x.b(obj);
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35108a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(x1 x1Var) {
            z1 z1Var = x1Var.f35094a;
            if (z1Var == null) {
                ju.t.t("presenter");
                z1Var = null;
            }
            z1Var.onSwipeToRefreshGesture();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return x1.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35108a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            x1.this.Cf();
            x1.this.Bf();
            SwipeRefreshLayout swipeRefreshLayout = x1.this.zf().f74444d;
            final x1 x1Var = x1.this;
            swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: com.server.auditor.ssh.client.navigation.y1
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
                public final void a() {
                    x1.d.k(x1Var);
                }
            });
            SwipeRefreshLayout swipeRefreshLayout2 = x1.this.zf().f74444d;
            ju.t.e(swipeRefreshLayout2, "swipeRefreshLayout");
            com.server.auditor.ssh.client.widget.q0.a(swipeRefreshLayout2);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35110a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35112c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10, zt.e eVar) {
            super(2, eVar);
            this.f35112c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return x1.this.new e(this.f35112c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35110a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            Intent intent = new Intent(x1.this.requireActivity(), (Class<?>) NewCryptoActivity.class);
            intent.putExtra("action_id", this.f35112c);
            x1.this.requireActivity().startActivity(intent);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35113a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35115c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, zt.e eVar) {
            super(2, eVar);
            this.f35115c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return x1.this.new f(this.f35115c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35113a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            String string = x1.this.getString(R.string.failed_granting_access_to_team_data);
            ju.t.e(string, "getString(...)");
            com.server.auditor.ssh.client.adapters.j jVar = x1.this.f35095b;
            if (jVar == null) {
                ju.t.t("adapter");
                jVar = null;
            }
            jVar.T(this.f35115c, string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35116a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35118c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, zt.e eVar) {
            super(2, eVar);
            this.f35118c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return x1.this.new g(this.f35118c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35116a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            View view = x1.this.getView();
            if (view != null) {
                String str = this.f35118c;
                u0.a aVar = tp.u0.f81015a;
                Context context = view.getContext();
                ju.t.e(context, "getContext(...)");
                aVar.b(context, view, str, 0).Y();
            }
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35119a;

        h(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return x1.this.new h(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35119a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            x1 x1Var = x1.this;
            String string = x1Var.getString(R.string.toast_internet_available);
            ju.t.e(string, "getString(...)");
            x1Var.k(string);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((h) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.m implements iu.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35121a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ProgressButton.b f35124d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i10, ProgressButton.b bVar, zt.e eVar) {
            super(2, eVar);
            this.f35123c = i10;
            this.f35124d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return x1.this.new i(this.f35123c, this.f35124d, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f35121a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.x.b(obj);
            com.server.auditor.ssh.client.adapters.j jVar = x1.this.f35095b;
            if (jVar == null) {
                ju.t.t("adapter");
                jVar = null;
            }
            jVar.S(this.f35123c, this.f35124d);
            return ut.m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(wu.i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(ut.m0.f82633a);
        }
    }

    private final void Af() {
        wu.k.d(androidx.lifecycle.a0.a(this), null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Bf() {
        Af();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Cf() {
        com.server.auditor.ssh.client.adapters.j jVar = new com.server.auditor.ssh.client.adapters.j(this.f35097d);
        this.f35095b = jVar;
        jVar.H(this.f35098e);
        RecyclerView recyclerView = zf().f74443c;
        com.server.auditor.ssh.client.adapters.j jVar2 = this.f35095b;
        if (jVar2 == null) {
            ju.t.t("adapter");
            jVar2 = null;
        }
        recyclerView.setAdapter(jVar2);
        zf().f74443c.setLayoutManager(new LinearLayoutManager(getContext()));
        zf().f74443c.i(new com.server.auditor.ssh.client.fragments.hostngroups.o1(0, getResources().getDimensionPixelSize(R.dimen.vertical_space_notifications)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ut.m0 Df(x1 x1Var, int i10, Integer num) {
        com.server.auditor.ssh.client.adapters.j jVar = x1Var.f35095b;
        z1 z1Var = null;
        if (jVar == null) {
            ju.t.t("adapter");
            jVar = null;
        }
        com.server.auditor.ssh.client.adapters.h hVarM = jVar.M(i10);
        if (hVarM != null) {
            z1 z1Var2 = x1Var.f35094a;
            if (z1Var2 == null) {
                ju.t.t("presenter");
            } else {
                z1Var = z1Var2;
            }
            z1Var.onActionButtonClicked(hVarM, num);
        }
        return ut.m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Ef(boolean z10) {
        AppCompatTextView appCompatTextView = zf().f74445e;
        ju.t.e(appCompatTextView, "youUpToDateText");
        appCompatTextView.setVisibility(z10 ? 0 : 8);
        AppCompatTextView appCompatTextView2 = zf().f74442b;
        ju.t.e(appCompatTextView2, "checkBackLaterText");
        appCompatTextView2.setVisibility(z10 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(String str) {
        androidx.lifecycle.a0.a(this).b(new g(str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y3 zf() {
        y3 y3Var = this.f35096c;
        if (y3Var != null) {
            return y3Var;
        }
        throw new IllegalStateException();
    }

    @Override // com.server.auditor.ssh.client.navigation.z1.a
    public void Qc(int i10) {
        androidx.lifecycle.a0.a(this).b(new e(i10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.z1.a
    public void c() {
        androidx.lifecycle.a0.a(this).b(new d(null));
    }

    @Override // com.server.auditor.ssh.client.navigation.z1.a
    public void kb(int i10) {
        androidx.lifecycle.a0.a(this).b(new b(i10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.z1.a
    public void lc(int i10) {
        androidx.lifecycle.a0.a(this).b(new f(i10, null));
    }

    @Override // com.server.auditor.ssh.client.navigation.z1.a
    public void n0() {
        androidx.lifecycle.a0.a(this).b(new h(null));
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        ju.t.e(fragmentActivityRequireActivity, "requireActivity(...)");
        this.f35094a = (z1) new androidx.lifecycle.l1(fragmentActivityRequireActivity).a(NotificationsFragmentViewModel.class);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ju.t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f35096c = y3.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = zf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        z1 z1Var = this.f35094a;
        if (z1Var == null) {
            ju.t.t("presenter");
            z1Var = null;
        }
        z1Var.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ju.t.f(view, "view");
        super.onViewCreated(view, bundle);
        z1 z1Var = this.f35094a;
        if (z1Var == null) {
            ju.t.t("presenter");
            z1Var = null;
        }
        z1Var.onViewCreated(this);
        ConstraintLayout constraintLayoutB = zf().b();
        ju.t.e(constraintLayoutB, "getRoot(...)");
        g6.Z1(constraintLayoutB, getArguments(), Boolean.FALSE);
    }

    @Override // com.server.auditor.ssh.client.navigation.z1.a
    public void sb(int i10, ProgressButton.b bVar) {
        ju.t.f(bVar, "buttonState");
        androidx.lifecycle.a0.a(this).b(new i(i10, bVar, null));
    }
}

package com.server.auditor.ssh.client.fragments.backupandsync;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.l0;
import androidx.navigation.k1;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.backupandsync.BackUpAndSyncDevicesScreen;
import com.server.auditor.ssh.client.presenters.backupandsync.BackUpAndSyncDevicesScreenPresenter;
import dh.s;
import iu.l;
import iu.p;
import java.util.List;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.u;
import qu.k;
import ut.i;
import ut.m0;
import ut.n;
import ut.o;
import ut.x;
import wu.i0;
import wu.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class BackUpAndSyncDevicesScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f24324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f24325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f24326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f24327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final n f24328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f24329f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final iu.a f24330u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final iu.a f24331v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final /* synthetic */ k[] f24322x = {n0.g(new g0(BackUpAndSyncDevicesScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/backupandsync/BackUpAndSyncDevicesScreenPresenter;", 0))};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f24321w = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f24323y = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24332a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24332a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDevicesScreen.this.requireActivity().finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24334a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24334a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncDevicesScreen.this.Rf();
            BackUpAndSyncDevicesScreen.this.Qf();
            BackUpAndSyncDevicesScreen.this.Nf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24336a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24336a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            if (!androidx.navigation.fragment.c.a(BackUpAndSyncDevicesScreen.this).T()) {
                BackUpAndSyncDevicesScreen.this.p();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24338a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24338a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarA = s.a();
            t.e(k1VarA, "actionBackUpAndSyncDevic…ncDesktopPromoScreen(...)");
            androidx.navigation.fragment.c.a(BackUpAndSyncDevicesScreen.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f implements l0, ju.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f24340a;

        f(l lVar) {
            t.f(lVar, "function");
            this.f24340a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f24340a.invoke(obj);
        }

        @Override // ju.n
        public final i c() {
            return this.f24340a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof l0) && (obj instanceof ju.n)) {
                return t.b(c(), ((ju.n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24341a;

        g(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncDevicesScreen.this.new g(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = au.b.f();
            int i10 = this.f24341a;
            if (i10 == 0) {
                x.b(obj);
                this.f24341a = 1;
                if (s0.b(500L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
            }
            BackUpAndSyncDevicesScreen.this.If().P();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public BackUpAndSyncDevicesScreen() {
        iu.a aVar = new iu.a() { // from class: dh.l
            @Override // iu.a
            public final Object a() {
                return BackUpAndSyncDevicesScreen.Wf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f24325b = new MoxyKtxDelegate(mvpDelegate, BackUpAndSyncDevicesScreenPresenter.class.getName() + ".presenter", aVar);
        this.f24326c = o.a(new iu.a() { // from class: dh.m
            @Override // iu.a
            public final Object a() {
                return BackUpAndSyncDevicesScreen.Ff(this.f47818a);
            }
        });
        this.f24327d = o.a(new iu.a() { // from class: dh.n
            @Override // iu.a
            public final Object a() {
                return BackUpAndSyncDevicesScreen.Gf(this.f47819a);
            }
        });
        this.f24328e = o.a(new iu.a() { // from class: dh.o
            @Override // iu.a
            public final Object a() {
                return BackUpAndSyncDevicesScreen.Hf(this.f47820a);
            }
        });
        this.f24329f = new l() { // from class: dh.p
            @Override // iu.l
            public final Object invoke(Object obj) {
                return BackUpAndSyncDevicesScreen.Tf(this.f47821a, (com.server.auditor.ssh.client.models.a) obj);
            }
        };
        this.f24330u = new iu.a() { // from class: dh.q
            @Override // iu.a
            public final Object a() {
                return BackUpAndSyncDevicesScreen.Vf(this.f47822a);
            }
        };
        this.f24331v = new iu.a() { // from class: dh.r
            @Override // iu.a
            public final Object a() {
                return BackUpAndSyncDevicesScreen.Uf(this.f47823a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.server.auditor.ssh.client.adapters.d Ff(BackUpAndSyncDevicesScreen backUpAndSyncDevicesScreen) {
        return new com.server.auditor.ssh.client.adapters.d(backUpAndSyncDevicesScreen.Mf().z2(), backUpAndSyncDevicesScreen.f24331v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.server.auditor.ssh.client.adapters.e Gf(BackUpAndSyncDevicesScreen backUpAndSyncDevicesScreen) {
        return new com.server.auditor.ssh.client.adapters.e(backUpAndSyncDevicesScreen.f24329f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.server.auditor.ssh.client.adapters.b Hf(BackUpAndSyncDevicesScreen backUpAndSyncDevicesScreen) {
        return new com.server.auditor.ssh.client.adapters.b(backUpAndSyncDevicesScreen.f24330u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.server.auditor.ssh.client.adapters.d If() {
        return (com.server.auditor.ssh.client.adapters.d) this.f24326c.getValue();
    }

    private final com.server.auditor.ssh.client.adapters.e Jf() {
        return (com.server.auditor.ssh.client.adapters.e) this.f24327d.getValue();
    }

    private final u Kf() {
        u uVar = this.f24324a;
        if (uVar != null) {
            return uVar;
        }
        throw new IllegalStateException();
    }

    private final com.server.auditor.ssh.client.adapters.b Lf() {
        return (com.server.auditor.ssh.client.adapters.b) this.f24328e.getValue();
    }

    private final BackUpAndSyncDevicesScreenPresenter Mf() {
        return (BackUpAndSyncDevicesScreenPresenter) this.f24325b.getValue(this, f24322x[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Nf() {
        Mf().B2().j(getViewLifecycleOwner(), new f(new l() { // from class: dh.j
            @Override // iu.l
            public final Object invoke(Object obj) {
                return BackUpAndSyncDevicesScreen.Of(this.f47815a, (List) obj);
            }
        }));
        Mf().A2().j(getViewLifecycleOwner(), new f(new l() { // from class: dh.k
            @Override // iu.l
            public final Object invoke(Object obj) {
                return BackUpAndSyncDevicesScreen.Pf(this.f47817a, (com.server.auditor.ssh.client.models.c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Of(BackUpAndSyncDevicesScreen backUpAndSyncDevicesScreen, List list) {
        com.server.auditor.ssh.client.adapters.e eVarJf = backUpAndSyncDevicesScreen.Jf();
        t.c(list);
        eVarJf.P(list);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Pf(BackUpAndSyncDevicesScreen backUpAndSyncDevicesScreen, com.server.auditor.ssh.client.models.c cVar) {
        com.server.auditor.ssh.client.adapters.b bVarLf = backUpAndSyncDevicesScreen.Lf();
        t.c(cVar);
        bVarLf.O(cVar);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Qf() {
        Kf().f74000c.setLayoutManager(new LinearLayoutManager(requireContext()));
        Kf().f74000c.setItemAnimator(new androidx.recyclerview.widget.i());
        Kf().f74000c.setAdapter(new androidx.recyclerview.widget.g(If(), Jf(), Lf()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Rf() {
        Kf().f73999b.f72289c.setText(getString(R.string.back_up_and_sync_devices_screen_title));
        Kf().f73999b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: dh.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackUpAndSyncDevicesScreen.Sf(this.f47813a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Sf(BackUpAndSyncDevicesScreen backUpAndSyncDevicesScreen, View view) {
        backUpAndSyncDevicesScreen.Mf().D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Tf(BackUpAndSyncDevicesScreen backUpAndSyncDevicesScreen, com.server.auditor.ssh.client.models.a aVar) {
        t.f(aVar, "it");
        backUpAndSyncDevicesScreen.Mf().G2(aVar);
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Uf(BackUpAndSyncDevicesScreen backUpAndSyncDevicesScreen) {
        backUpAndSyncDevicesScreen.Mf().C2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Vf(BackUpAndSyncDevicesScreen backUpAndSyncDevicesScreen) {
        backUpAndSyncDevicesScreen.Mf().I2();
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BackUpAndSyncDevicesScreenPresenter Wf() {
        return new BackUpAndSyncDevicesScreenPresenter();
    }

    @Override // com.server.auditor.ssh.client.contracts.d
    public void N1() {
        bh.a.b(this, new g(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.d
    public void a() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.d
    public void b() {
        bh.a.b(this, new d(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f24324a = u.c(layoutInflater, viewGroup, false);
        CoordinatorLayout coordinatorLayoutB = Kf().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f24324a = null;
        super.onDestroyView();
    }

    @Override // com.server.auditor.ssh.client.contracts.d
    public void p() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.d
    public void u5() {
        bh.a.b(this, new e(null));
    }
}

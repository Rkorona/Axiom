package com.server.auditor.ssh.client.fragments.backupandsync;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.k1;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.adapters.g;
import com.server.auditor.ssh.client.contracts.l;
import com.server.auditor.ssh.client.fragments.backupandsync.BackUpAndSyncSecureVaultScreen;
import com.server.auditor.ssh.client.fragments.hostngroups.o1;
import com.server.auditor.ssh.client.presenters.backupandsync.BackUpAndSyncSecureVaultScreenPresenter;
import dh.l0;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.a0;
import qu.k;
import ut.m0;
import ut.x;
import wu.i0;
import zt.e;

/* JADX INFO: loaded from: classes3.dex */
public final class BackUpAndSyncSecureVaultScreen extends MvpAppCompatFragment implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a0 f24404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f24405b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ k[] f24402d = {n0.g(new g0(BackUpAndSyncSecureVaultScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/backupandsync/BackUpAndSyncSecureVaultScreenPresenter;", 0))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24401c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24403e = 8;

    public static final class a {
        public /* synthetic */ a(ju.k kVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24406a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BackUpAndSyncSecureVaultScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24406a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncSecureVaultScreen.this.Cf();
            BackUpAndSyncSecureVaultScreen.this.Bf();
            BackUpAndSyncSecureVaultScreen.this.zf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24408a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BackUpAndSyncSecureVaultScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24408a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            androidx.navigation.fragment.c.a(BackUpAndSyncSecureVaultScreen.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24410a;

        d(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BackUpAndSyncSecureVaultScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24410a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarA = l0.a();
            t.e(k1VarA, "actionBackUpAndSyncSecur…ecureSyncSetupScreen(...)");
            androidx.navigation.fragment.c.a(BackUpAndSyncSecureVaultScreen.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public BackUpAndSyncSecureVaultScreen() {
        iu.a aVar = new iu.a() { // from class: dh.k0
            @Override // iu.a
            public final Object a() {
                return BackUpAndSyncSecureVaultScreen.Ef();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f24405b = new MoxyKtxDelegate(mvpDelegate, BackUpAndSyncSecureVaultScreenPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Af(BackUpAndSyncSecureVaultScreen backUpAndSyncSecureVaultScreen, View view) {
        backUpAndSyncSecureVaultScreen.yf().s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Bf() {
        xf().f71849m.setLayoutManager(new LinearLayoutManager(requireContext()));
        xf().f71849m.i(new o1(tp.p.a(0), tp.p.a(10)));
        xf().f71849m.setAdapter(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Cf() {
        xf().f71838b.f72289c.setText(getString(R.string.secure_vault_screen_title));
        xf().f71838b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: dh.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackUpAndSyncSecureVaultScreen.Df(this.f47814a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Df(BackUpAndSyncSecureVaultScreen backUpAndSyncSecureVaultScreen, View view) {
        backUpAndSyncSecureVaultScreen.yf().r2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BackUpAndSyncSecureVaultScreenPresenter Ef() {
        return new BackUpAndSyncSecureVaultScreenPresenter();
    }

    private final a0 xf() {
        a0 a0Var = this.f24404a;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException();
    }

    private final BackUpAndSyncSecureVaultScreenPresenter yf() {
        return (BackUpAndSyncSecureVaultScreenPresenter) this.f24405b.getValue(this, f24402d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zf() {
        xf().f71850n.setOnClickListener(new View.OnClickListener() { // from class: dh.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackUpAndSyncSecureVaultScreen.Af(this.f47816a, view);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.contracts.l
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.l
    public void b() {
        bh.a.b(this, new c(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f24404a = a0.c(layoutInflater, viewGroup, false);
        View viewB = xf().b();
        t.e(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f24404a = null;
        super.onDestroyView();
    }

    @Override // com.server.auditor.ssh.client.contracts.l
    public void u1() {
        bh.a.b(this, new d(null));
    }
}

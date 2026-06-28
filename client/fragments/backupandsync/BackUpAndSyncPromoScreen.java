package com.server.auditor.ssh.client.fragments.backupandsync;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.h;
import com.server.auditor.ssh.client.fragments.backupandsync.BackUpAndSyncPromoScreen;
import com.server.auditor.ssh.client.presenters.backupandsync.BackUpAndSyncPromoScreenPresenter;
import dh.a0;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.w;
import qu.k;
import ut.m0;
import ut.x;
import wu.i0;
import zt.e;

/* JADX INFO: loaded from: classes3.dex */
public final class BackUpAndSyncPromoScreen extends MvpAppCompatFragment implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final /* synthetic */ k[] f24358c = {n0.g(new g0(BackUpAndSyncPromoScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/backupandsync/BackUpAndSyncPromoScreenPresenter;", 0))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f24359d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private w f24360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f24361b;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24362a;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BackUpAndSyncPromoScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24362a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncPromoScreen.this.requireActivity().finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24364a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BackUpAndSyncPromoScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24364a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncPromoScreen.this.Cf();
            BackUpAndSyncPromoScreen.this.zf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24366a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BackUpAndSyncPromoScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24366a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarA = a0.a();
            t.e(k1VarA, "actionBackUpAndSyncPromo…ecureSyncSetupScreen(...)");
            androidx.navigation.fragment.c.a(BackUpAndSyncPromoScreen.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24368a;

        d(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BackUpAndSyncPromoScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24368a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarB = a0.b();
            t.e(k1VarB, "actionBackUpAndSyncPromo…yncSecureVaultScreen(...)");
            androidx.navigation.fragment.c.a(BackUpAndSyncPromoScreen.this).O(k1VarB);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public BackUpAndSyncPromoScreen() {
        iu.a aVar = new iu.a() { // from class: dh.x
            @Override // iu.a
            public final Object a() {
                return BackUpAndSyncPromoScreen.Ef();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f24361b = new MoxyKtxDelegate(mvpDelegate, BackUpAndSyncPromoScreenPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Af(BackUpAndSyncPromoScreen backUpAndSyncPromoScreen, View view) {
        backUpAndSyncPromoScreen.yf().s2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bf(BackUpAndSyncPromoScreen backUpAndSyncPromoScreen, View view) {
        backUpAndSyncPromoScreen.yf().t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Cf() {
        xf().f74186b.f72289c.setText(getString(R.string.back_up_and_sync_title));
        xf().f74186b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: dh.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackUpAndSyncPromoScreen.Df(this.f47825a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Df(BackUpAndSyncPromoScreen backUpAndSyncPromoScreen, View view) {
        backUpAndSyncPromoScreen.yf().r2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BackUpAndSyncPromoScreenPresenter Ef() {
        return new BackUpAndSyncPromoScreenPresenter();
    }

    private final w xf() {
        w wVar = this.f24360a;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException();
    }

    private final BackUpAndSyncPromoScreenPresenter yf() {
        return (BackUpAndSyncPromoScreenPresenter) this.f24361b.getValue(this, f24358c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zf() {
        xf().f74201q.setOnClickListener(new View.OnClickListener() { // from class: dh.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackUpAndSyncPromoScreen.Af(this.f47826a, view);
            }
        });
        xf().f74202r.setOnClickListener(new View.OnClickListener() { // from class: dh.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackUpAndSyncPromoScreen.Bf(this.f47827a, view);
            }
        });
    }

    @Override // com.server.auditor.ssh.client.contracts.h
    public void O5() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.h
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f24360a = w.c(layoutInflater, viewGroup, false);
        View viewB = xf().b();
        t.e(viewB, "getRoot(...)");
        return viewB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f24360a = null;
        super.onDestroyView();
    }

    @Override // com.server.auditor.ssh.client.contracts.h
    public void p() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.h
    public void u1() {
        bh.a.b(this, new c(null));
    }
}

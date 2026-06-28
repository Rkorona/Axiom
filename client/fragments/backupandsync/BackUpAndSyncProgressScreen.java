package com.server.auditor.ssh.client.fragments.backupandsync;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.e0;
import androidx.activity.h0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.a0;
import androidx.lifecycle.q;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.contracts.f;
import com.server.auditor.ssh.client.fragments.backupandsync.BackUpAndSyncProgressScreen;
import com.server.auditor.ssh.client.presenters.backupandsync.BackUpAndSyncProgressScreenPresenter;
import iu.l;
import iu.p;
import ju.g0;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.v;
import qu.k;
import ut.m0;
import ut.x;
import wu.i0;
import zt.e;

/* JADX INFO: loaded from: classes3.dex */
public final class BackUpAndSyncProgressScreen extends MvpAppCompatFragment implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ k[] f24343e = {n0.g(new g0(BackUpAndSyncProgressScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/backupandsync/BackUpAndSyncProgressScreenPresenter;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f24344f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f24345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e0 f24346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.c f24347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MoxyKtxDelegate f24348d;

    public static final class a extends androidx.vectordrawable.graphics.drawable.b {

        /* JADX INFO: renamed from: com.server.auditor.ssh.client.fragments.backupandsync.BackUpAndSyncProgressScreen$a$a, reason: collision with other inner class name */
        static final class C0389a extends m implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f24350a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BackUpAndSyncProgressScreen f24351b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0389a(BackUpAndSyncProgressScreen backUpAndSyncProgressScreen, e eVar) {
                super(2, eVar);
                this.f24351b = backUpAndSyncProgressScreen;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new C0389a(this.f24351b, eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                au.b.f();
                if (this.f24350a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.b(obj);
                if (this.f24351b.getLifecycle().b().c(q.b.f8799d)) {
                    this.f24351b.xf().q2();
                }
                return m0.f82633a;
            }

            @Override // iu.p
            public final Object invoke(i0 i0Var, e eVar) {
                return ((C0389a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
            }
        }

        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            wu.k.d(a0.a(BackUpAndSyncProgressScreen.this), null, null, new C0389a(BackUpAndSyncProgressScreen.this, null), 3, null);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24352a;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BackUpAndSyncProgressScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24352a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncProgressScreen.this.yf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24354a;

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BackUpAndSyncProgressScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24354a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarA = dh.v.a();
            t.e(k1VarA, "actionBackUpAndSyncProgr…ncDesktopPromoScreen(...)");
            androidx.navigation.fragment.c.a(BackUpAndSyncProgressScreen.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24356a;

        d(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return BackUpAndSyncProgressScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24356a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            androidx.vectordrawable.graphics.drawable.c cVar = BackUpAndSyncProgressScreen.this.f24347c;
            if (cVar != null) {
                cVar.start();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public BackUpAndSyncProgressScreen() {
        iu.a aVar = new iu.a() { // from class: dh.t
            @Override // iu.a
            public final Object a() {
                return BackUpAndSyncProgressScreen.Af();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f24348d = new MoxyKtxDelegate(mvpDelegate, BackUpAndSyncProgressScreenPresenter.class.getName() + ".presenter", aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BackUpAndSyncProgressScreenPresenter Af() {
        return new BackUpAndSyncProgressScreenPresenter();
    }

    private final v wf() {
        v vVar = this.f24345a;
        if (vVar != null) {
            return vVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BackUpAndSyncProgressScreenPresenter xf() {
        return (BackUpAndSyncProgressScreenPresenter) this.f24348d.getValue(this, f24343e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yf() {
        androidx.vectordrawable.graphics.drawable.c cVar = this.f24347c;
        if (cVar != null) {
            cVar.a();
        }
        androidx.vectordrawable.graphics.drawable.c cVarB = androidx.vectordrawable.graphics.drawable.c.b(requireContext(), R.drawable.ic_lock_with_rounded_arrows);
        this.f24347c = cVarB;
        if (cVarB != null) {
            cVarB.d(new a());
        }
        wf().f74090f.setImageDrawable(this.f24347c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 zf(BackUpAndSyncProgressScreen backUpAndSyncProgressScreen, e0 e0Var) {
        t.f(e0Var, "$this$addCallback");
        backUpAndSyncProgressScreen.xf().r2();
        return m0.f82633a;
    }

    @Override // com.server.auditor.ssh.client.contracts.f
    public void Md() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.f
    public void P3() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.f
    public void a() {
        bh.a.b(this, new b(null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        t.f(context, "context");
        super.onAttach(context);
        e0 e0VarB = h0.b(requireActivity().getOnBackPressedDispatcher(), this, false, new l() { // from class: dh.u
            @Override // iu.l
            public final Object invoke(Object obj) {
                return BackUpAndSyncProgressScreen.zf(this.f47824a, (androidx.activity.e0) obj);
            }
        }, 2, null);
        this.f24346b = e0VarB;
        if (e0VarB == null) {
            t.t("onBackPressedCallback");
            e0VarB = null;
        }
        e0VarB.j(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f24345a = v.c(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutB = wf().b();
        t.e(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f24345a = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        e0 e0Var = this.f24346b;
        if (e0Var == null) {
            t.t("onBackPressedCallback");
            e0Var = null;
        }
        e0Var.h();
        super.onDetach();
    }
}

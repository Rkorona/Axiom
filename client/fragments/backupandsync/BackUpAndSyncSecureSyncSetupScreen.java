package com.server.auditor.ssh.client.fragments.backupandsync;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResult;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.l0;
import androidx.lifecycle.u0;
import androidx.navigation.d0;
import androidx.navigation.k1;
import com.server.auditor.ssh.client.R;
import com.server.auditor.ssh.client.fragments.backupandsync.BackUpAndSyncSecureSyncSetupScreen;
import com.server.auditor.ssh.client.fragments.loginregistration.LoginActivity;
import com.server.auditor.ssh.client.fragments.loginregistration.SignUpChooserScreenArgs;
import com.server.auditor.ssh.client.navigation.EndOfTrialActivity;
import com.server.auditor.ssh.client.presenters.backupandsync.BackUpAndSyncSecureSyncSetupScreenPresenter;
import com.server.auditor.ssh.client.utils.analytics.Avo;
import dh.h0;
import iu.l;
import iu.p;
import ju.g0;
import ju.n;
import ju.n0;
import ju.t;
import kotlin.coroutines.jvm.internal.m;
import moxy.MvpAppCompatFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import qg.y;
import ut.m0;
import ut.x;
import wu.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class BackUpAndSyncSecureSyncSetupScreen extends MvpAppCompatFragment implements com.server.auditor.ssh.client.contracts.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ qu.k[] f24370d = {n0.g(new g0(BackUpAndSyncSecureSyncSetupScreen.class, "presenter", "getPresenter()Lcom/server/auditor/ssh/client/presenters/backupandsync/BackUpAndSyncSecureSyncSetupScreenPresenter;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f24371e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private y f24372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MoxyKtxDelegate f24373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g.b f24374c;

    static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24375a;

        a(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncSecureSyncSetupScreen.this.new a(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24375a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncSecureSyncSetupScreen.this.Mf();
            BackUpAndSyncSecureSyncSetupScreen.this.If();
            BackUpAndSyncSecureSyncSetupScreen.this.Lf();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class b extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24377a;

        b(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncSecureSyncSetupScreen.this.new b(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24377a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            androidx.navigation.fragment.c.a(BackUpAndSyncSecureSyncSetupScreen.this).S();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class c extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24379a;

        c(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncSecureSyncSetupScreen.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24379a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarA = h0.a();
            t.e(k1VarA, "actionBackUpAndSyncSecur…ncDesktopPromoScreen(...)");
            androidx.navigation.fragment.c.a(BackUpAndSyncSecureSyncSetupScreen.this).O(k1VarA);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class d extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24381a;

        d(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncSecureSyncSetupScreen.this.new d(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24381a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            k1 k1VarB = h0.b();
            t.e(k1VarB, "actionBackUpAndSyncSecur…ndSyncProgressScreen(...)");
            androidx.navigation.fragment.c.a(BackUpAndSyncSecureSyncSetupScreen.this).O(k1VarB);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class e extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24383a;

        e(zt.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncSecureSyncSetupScreen.this.new e(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24383a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            EndOfTrialActivity.a aVar = EndOfTrialActivity.f28139c;
            Context contextRequireContext = BackUpAndSyncSecureSyncSetupScreen.this.requireContext();
            t.e(contextRequireContext, "requireContext(...)");
            aVar.c(contextRequireContext, EndOfTrialActivity.ExpiredSubscriptionFlow.PromoFlow.INSTANCE, Avo.ChoosePlanSource.BACKUP_SYNC);
            BackUpAndSyncSecureSyncSetupScreen.this.requireActivity().finish();
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class f extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24385a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24387c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24387c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncSecureSyncSetupScreen.this.new f(this.f24387c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24385a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            Intent intent = new Intent(BackUpAndSyncSecureSyncSetupScreen.this.requireActivity(), (Class<?>) LoginActivity.class);
            intent.setAction("registrationFlowAction");
            Bundle bundle = new SignUpChooserScreenArgs.a(121, this.f24387c, true).a().toBundle();
            t.e(bundle, "toBundle(...)");
            intent.putExtras(bundle);
            BackUpAndSyncSecureSyncSetupScreen.this.f24374c.a(intent);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class g extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActivityResult f24389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ BackUpAndSyncSecureSyncSetupScreen f24390c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ActivityResult activityResult, BackUpAndSyncSecureSyncSetupScreen backUpAndSyncSecureSyncSetupScreen, zt.e eVar) {
            super(2, eVar);
            this.f24389b = activityResult;
            this.f24390c = backUpAndSyncSecureSyncSetupScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return new g(this.f24389b, this.f24390c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24388a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            int resultCode = this.f24389b.getResultCode();
            if (resultCode == 1 || resultCode == 2 || resultCode == 3) {
                this.f24390c.Ff().x2();
            } else {
                this.f24390c.Ff().w2();
            }
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((g) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class h implements l0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ l f24391a;

        h(l lVar) {
            t.f(lVar, "function");
            this.f24391a = lVar;
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void a(Object obj) {
            this.f24391a.invoke(obj);
        }

        @Override // ju.n
        public final ut.i c() {
            return this.f24391a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof l0) && (obj instanceof n)) {
                return t.b(c(), ((n) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    static final class i extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24392a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24394c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24394c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncSecureSyncSetupScreen.this.new i(this.f24394c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24392a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncSecureSyncSetupScreen.this.Ef().f74415m.f74516n.setVisibility(this.f24394c ? 0 : 4);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((i) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class j extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24395a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24397c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24397c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncSecureSyncSetupScreen.this.new j(this.f24397c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24395a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncSecureSyncSetupScreen.this.Ef().f74415m.f74518p.setChecked(this.f24397c);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((j) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    static final class k extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24398a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f24400c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, zt.e eVar) {
            super(2, eVar);
            this.f24400c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zt.e create(Object obj, zt.e eVar) {
            return BackUpAndSyncSecureSyncSetupScreen.this.new k(this.f24400c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            au.b.f();
            if (this.f24398a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.b(obj);
            BackUpAndSyncSecureSyncSetupScreen.this.Ef().f74415m.f74520r.setVisibility(this.f24400c ? 0 : 4);
            return m0.f82633a;
        }

        @Override // iu.p
        public final Object invoke(i0 i0Var, zt.e eVar) {
            return ((k) create(i0Var, eVar)).invokeSuspend(m0.f82633a);
        }
    }

    public BackUpAndSyncSecureSyncSetupScreen() {
        iu.a aVar = new iu.a() { // from class: dh.b0
            @Override // iu.a
            public final Object a() {
                return BackUpAndSyncSecureSyncSetupScreen.Pf();
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        t.e(mvpDelegate, "mvpDelegate");
        this.f24373b = new MoxyKtxDelegate(mvpDelegate, BackUpAndSyncSecureSyncSetupScreenPresenter.class.getName() + ".presenter", aVar);
        g.b bVarRegisterForActivityResult = registerForActivityResult(new h.c(), new g.a() { // from class: dh.c0
            @Override // g.a
            public final void a(Object obj) {
                BackUpAndSyncSecureSyncSetupScreen.Df(this.f47803a, (ActivityResult) obj);
            }
        });
        t.e(bVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f24374c = bVarRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Df(BackUpAndSyncSecureSyncSetupScreen backUpAndSyncSecureSyncSetupScreen, ActivityResult activityResult) {
        t.f(activityResult, "it");
        backUpAndSyncSecureSyncSetupScreen.Of(activityResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y Ef() {
        y yVar = this.f24372a;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BackUpAndSyncSecureSyncSetupScreenPresenter Ff() {
        return (BackUpAndSyncSecureSyncSetupScreenPresenter) this.f24373b.getValue(this, f24370d[0]);
    }

    private final void Gf() {
        final u0 u0VarJ;
        d0 d0VarS = androidx.navigation.fragment.c.a(this).s();
        if (d0VarS == null || (u0VarJ = d0VarS.j()) == null) {
            return;
        }
        u0VarJ.d("CHOOSE_PLAN_RESULT_CODE_KEY").j(getViewLifecycleOwner(), new h(new l() { // from class: dh.g0
            @Override // iu.l
            public final Object invoke(Object obj) {
                return BackUpAndSyncSecureSyncSetupScreen.Hf(this.f47810a, u0VarJ, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 Hf(BackUpAndSyncSecureSyncSetupScreen backUpAndSyncSecureSyncSetupScreen, u0 u0Var, Boolean bool) {
        BackUpAndSyncSecureSyncSetupScreenPresenter backUpAndSyncSecureSyncSetupScreenPresenterFf = backUpAndSyncSecureSyncSetupScreen.Ff();
        t.c(bool);
        backUpAndSyncSecureSyncSetupScreenPresenterFf.z2(bool.booleanValue());
        u0Var.f("CHOOSE_PLAN_RESULT_CODE_KEY");
        return m0.f82633a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void If() {
        Ef().f74415m.f74518p.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: dh.e0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                BackUpAndSyncSecureSyncSetupScreen.Jf(this.f47806a, compoundButton, z10);
            }
        });
        Ef().f74409g.setOnClickListener(new View.OnClickListener() { // from class: dh.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackUpAndSyncSecureSyncSetupScreen.Kf(this.f47808a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jf(BackUpAndSyncSecureSyncSetupScreen backUpAndSyncSecureSyncSetupScreen, CompoundButton compoundButton, boolean z10) {
        backUpAndSyncSecureSyncSetupScreen.Ff().B2(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kf(BackUpAndSyncSecureSyncSetupScreen backUpAndSyncSecureSyncSetupScreen, View view) {
        backUpAndSyncSecureSyncSetupScreen.Ff().A2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Lf() {
        Gf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Mf() {
        Ef().f74404b.f72289c.setText(getString(R.string.secure_sync_setup_screen_title));
        Ef().f74404b.f72288b.setOnClickListener(new View.OnClickListener() { // from class: dh.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BackUpAndSyncSecureSyncSetupScreen.Nf(this.f47804a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nf(BackUpAndSyncSecureSyncSetupScreen backUpAndSyncSecureSyncSetupScreen, View view) {
        backUpAndSyncSecureSyncSetupScreen.Ff().y2();
    }

    private final void Of(ActivityResult activityResult) {
        bh.a.b(this, new g(activityResult, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BackUpAndSyncSecureSyncSetupScreenPresenter Pf() {
        return new BackUpAndSyncSecureSyncSetupScreenPresenter();
    }

    @Override // com.server.auditor.ssh.client.contracts.j
    public void H9(boolean z10) {
        bh.a.b(this, new j(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.j
    public void Nd() {
        bh.a.b(this, new c(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.j
    public void a() {
        bh.a.b(this, new a(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.j
    public void b() {
        bh.a.b(this, new b(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.j
    public void h8(boolean z10) {
        bh.a.b(this, new k(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.j
    public void n6() {
        bh.a.b(this, new d(null));
    }

    @Override // com.server.auditor.ssh.client.contracts.j
    public void o() {
        bh.a.b(this, new e(null));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        t.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f24372a = y.c(layoutInflater, viewGroup, false);
        CoordinatorLayout coordinatorLayoutB = Ef().b();
        t.e(coordinatorLayoutB, "getRoot(...)");
        return coordinatorLayoutB;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f24372a = null;
    }

    @Override // com.server.auditor.ssh.client.contracts.j
    public void p6(boolean z10) {
        bh.a.b(this, new f(z10, null));
    }

    @Override // com.server.auditor.ssh.client.contracts.j
    public void re(boolean z10) {
        bh.a.b(this, new i(z10, null));
    }
}
